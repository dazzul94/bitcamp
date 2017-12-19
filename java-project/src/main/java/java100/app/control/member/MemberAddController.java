package java100.app.control.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;

@Component("/member/add")
public class MemberAddController implements PageController {

    @Autowired
    MemberDao memberDao;

    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Member member = new Member(request.getParameter("name"), request.getParameter("email"),
                request.getParameter("password"));
        memberDao.insert(member);
        return "redirect:list.do";// DispatcherServlet이 쓸거

    }

}
