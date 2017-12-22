package java100.app.web.v02;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/v02/test13")
public class Test13 {

    @RequestMapping(method= RequestMethod.POST)
    public String fileUpload(@RequestParam("name") String name, @RequestParam("age") int age, 
            @RequestParam("working") boolean working, @RequestParam("photo") MultipartFile photo) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(photo.getOriginalFilename());
        return "/hello.jsp";
    }
}
