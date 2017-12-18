package java100.app.servlet.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        
        Member member = new Member(Integer.parseInt(request.getParameter("no")), request.getParameter("name"),
                request.getParameter("email"), request.getParameter("password"));
        int count = memberDao.update(member);
        request.setAttribute("count", count);
        
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = request.getRequestDispatcher("/member/update.jsp");
        rd.include(request, response);

    }

}
