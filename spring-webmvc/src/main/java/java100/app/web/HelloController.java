package java100.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //<= dispatcherServlet 은 이 애노테이션이 붙은 클래스의 인스턴스를 자동생성한다.
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello() {
        return "/hello.jsp";
    }
}
