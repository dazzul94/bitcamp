package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.AppInitServlet;
import java100.app.dao.DaoException;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@WebServlet(urlPatterns = "/room/*")
public class RoomServlet extends ArrayList<Room> implements Servlet {
    private static final long serialVersionUID = 1L;

    RoomDao roomDao;
    ServletConfig servletConfig;

    @Override
    public void destroy() {
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
        this.roomDao = AppInitServlet.iocContainer.getBean(RoomDao.class);
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public String getServletInfo() {
        return "강의실관리 서블릿";
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        httpResponse.setContentType("text/plain;charset=UTF-8");

        switch (httpRequest.getPathInfo()) {
        case "/list":
            this.doList(httpRequest, httpResponse);
            break;
        case "/add":
            this.doAdd(httpRequest, httpResponse);
            break;
        case "/delete":
            this.doDelete(httpRequest, httpResponse);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doList(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");
        try {
            List<Room> list = roomDao.selectList();
            for (Room room : list) {
                out.printf("%d, %-4s, %4s, %4d\n", room.getNo(), room.getName(), room.getLocation(),
                        room.getCapacity());
            }

        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    private void doAdd(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        try {
            Room room = new Room();
            room.setName(request.getParameter("name"));
            room.setLocation(request.getParameter("loc"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

            roomDao.insert(room);
            out.println("저장하였습니다");

        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }

    private void doDelete(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");

        int no = Integer.parseInt(request.getParameter("no"));
        try {
            if (roomDao.delete(no) > 0) {
                out.println("삭제하였습니다");
            } else {
                out.printf("%s의 성적 정보가 없습니다.\n", no);
            }
        } catch (Exception e) {
            throw new DaoException(e);
        }
    }
}
