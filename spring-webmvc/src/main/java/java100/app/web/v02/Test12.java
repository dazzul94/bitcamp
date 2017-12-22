package java100.app.web.v02;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {

    @RequestMapping("m1")
    public String m1(String name, int age, boolean working, float height) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(height);
        System.out.println("-----------------------------------------------");
        return "/hello.jsp";
    }
    @RequestMapping("m2")
    public String m1(Date birthDate) {
        System.out.println(birthDate);
        System.out.println("-----------------------------------------------");
        return "/hello.jsp";
    }
}
