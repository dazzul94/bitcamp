package java100.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContoller {
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
