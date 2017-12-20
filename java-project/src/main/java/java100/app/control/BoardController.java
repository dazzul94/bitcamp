package java100.app.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@Controller
public class BoardController {
    
    @Autowired
    BoardDao boardDao;
    
    @RequestMapping("/board/list")
    public String list(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        List<Board> list = boardDao.selectList();

        request.setAttribute("list", list);
        return "/board/list.jsp";// DispatcherServlet이 쓸거
    }
    
    @RequestMapping("/board/add")
    public String add(Board board,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        boardDao.insert(board);
        return "redirect:list.do";//DispatcherServlet이 쓸거
    }
    
    @RequestMapping("/board/delete")
    public String delete(@RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        boardDao.delete(no);
        return "redirect:list.do";// DispatcherServlet이 쓸거
    }
    
    @RequestMapping("/board/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {

        return "/board/form.jsp";// DispatcherServlet이 쓸거
    }
    
    @RequestMapping("/board/update")
    public String update(Board board,
                         HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        boardDao.update(board);
        return "redirect:list.do";// DispatcherServlet이 쓸거
    }

    @RequestMapping("/board/view")
    public String view(@RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        Board board = boardDao.selectOne(no);

        request.setAttribute("board", board);
        return "/board/view.jsp";// DispatcherServlet이 쓸거
    }


}
