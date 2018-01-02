package java100.app.web;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;

//@Component 대신 @Controller를 붙여 페이지 컨트롤러임을 명시한다.
//
//스프링 IoC 컨테이너에서 애노테이션 중에서 객체 생성을 표시하는 애노테이션
//=> @Component
// - 일반 클래스에 대해 주로 붙인다.
//=> @Controller
// - 웹 애플리케이션에서 페이지 컨트롤러 역할을 수행하는 클래스에 주로 붙인다.
//=> @Service
// - MVC 아키텍처에서 Model 중에 비즈니스 로직을 담당하는 클래스에 붙인다.
//=> @Repository
// - MVC 아키텍처의 Model 중에서 데이터 처리를 담당하는 클래스에 붙인다.
// - 주로 DAO 클래스에 붙인다.
//
@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardDao boardDao;

    @RequestMapping("list")
    public String list(
            @RequestParam(value="nm", required=false) String[] titles, 
            @RequestParam(value="oc", required=false) String orderColumn, 
            @RequestParam(value="al", required=false) String align, 
            Model model) throws Exception {
        
        HashMap<String, Object> params = new HashMap<>();
        params.put("titles", titles);
        params.put("orderColumn", orderColumn);
        params.put("align", align);
        model.addAttribute("list", boardDao.findAll(params));
        return "board/list";
    }

    @RequestMapping("add")
    public String add(Board board) throws Exception {
        boardDao.insert(board);
        return "redirect:list";
    }

    @RequestMapping("delete")
    public String delete(int no) throws Exception {
        boardDao.delete(no);
        return "redirect:list";
    }

    @RequestMapping("form")
    public String form() throws Exception {
        return "board/form";
    }

    @RequestMapping("update")
    public String update(Board board) throws Exception {
        boardDao.update(board);
        return "redirect:list";
    }

    @RequestMapping("{no}")
    public String view(@PathVariable int no, Model model) throws Exception {
        boardDao.updateViewCount(no);
        model.addAttribute("board", boardDao.findByNo(no));
        return "board/view";

    }
}
