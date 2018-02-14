package java100.app.web;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.RestTemplate;

import java100.app.domain.Member;
import java100.app.service.MemberService;

@Controller
@RequestMapping("/auth")
@SessionAttributes("loginUser") //model에 loginUser라는 이름으로 저장한다면 session에도 저장해줘
public class LoginController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("menuVisible", false);
        return "auth/loginform";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String email, String password, String saveEmail, HttpServletResponse response, Model model) {

        Member member = memberService.get(email, password);

        if (saveEmail != null) {
            Cookie cookie = new Cookie("email", email);
            cookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(cookie);
        } else {
            Cookie cookie = new Cookie("email", "");
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }

        if (member == null) {
            model.addAttribute("loginUser", null);
            model.addAttribute("menuVisible", false);
            return "auth/loginfail";
        }

        model.addAttribute("loginUser", member);

        return "redirect:../score/list";
    }

    @RequestMapping(value = "facebookLogin")
    public String facebookLogin(String accessToken, HttpSession httpSession, HttpServletResponse response, // 쿠키 정보를 초기화
            Model model) {
        
            System.out.println(accessToken);
            RestTemplate restTemplate = new RestTemplate(); // 페이스북 서버한테 요청
        try {
            @SuppressWarnings("rawtypes")
            Map result = restTemplate.getForObject(
                    // Map에 담는다면 v1, v2를 찾아가고 배열이라면 그냥 순서대로 넣어준다
                    "https://graph.facebook.com/v2.12/me?access_token={v1}&fields={v2}", Map.class, // return type
                    accessToken, "id,name,email,gender,devices");
            
            Member member = memberService.get((String)result.get("email"));
            if(member == null) {
                member = new Member();
                member.setName((String)result.get("name"));
                member.setEmail((String)result.get("email"));
                member.setPassword("1111");
                memberService.add(member);
            } 
            model.addAttribute("loginUser", member);
            return "redirect:../score/list";
        } catch (Exception e) {
            return "redirect:auth/loginfail";
        }
        // 이제 가입된 이메일이 있느지 확인하고 없다면 자동 로그인,
        // 그리고 httpSession에 추가

    }

    @RequestMapping("logout")
    public String logout(HttpSession session, SessionStatus status) {

        // @SessionAttributes에서 관리하는 세션 데이터를 모두 제거한다.
        status.setComplete();

        // HttpSession 객체를 무효화시킨다.
        session.invalidate();

        return "redirect:login";
    }

}
