package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/member/view")
public class MemberViewServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);

        response.setContentType("text/plain;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("[회원 삭제]");

        try {

            int no = Integer.parseInt(request.getParameter("no"));
            if (memberDao.delete(no) > 0) {
                out.println("삭제했습니다");
            } else {
                out.printf("%s의 성적 정보가 없습니다.\n", request.getParameter("no"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
    }

}
