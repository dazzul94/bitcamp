package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test09")
public class Test09 {

//    @RequestMapping(method=RequestMethod.GET)
    @GetMapping
    public String m1() {
        System.out.println("get()");
        return "/hello.jsp";
    }
    @PostMapping
    public String m2() {
        System.out.println("post()");
        return "/hello.jsp";
    }
}
