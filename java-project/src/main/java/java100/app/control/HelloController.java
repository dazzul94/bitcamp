package java100.app.control;

import java.io.PrintWriter;
import java.util.ArrayList;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

public class HelloController extends ArrayList<Room> implements Controller {
    private static final long serialVersionUID = 1L;

    RoomDao roomDao;

    public void setRoomDao(RoomDao roomDao) {
        this.roomDao = roomDao;
    }


    @Override
    public void destroy() {
    }


    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("JDBC 드라이버를 찾을 수 없습니다");
        }
    }
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/hello/hi": this.doHi(request, response); break;
        case "/hello/hi2": this.doHi2(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doHi(Request request, Response response) {
        PrintWriter out  = response.getWriter();
        out.println("하이루~~~");
    }

    private void doHi2(Request request, Response response) {
        PrintWriter out = response.getWriter();
            out.println("안녕~~~");
    } 

}










