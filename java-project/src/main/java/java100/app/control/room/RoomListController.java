package java100.app.control.room;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@Component("/room/list")
public class RoomListController implements PageController {
    @Autowired
    RoomDao roomDao;

    @Override
    public String service(HttpServletRequest request, HttpServletResponse response) throws Exception {

        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        List<Room> list = roomDao.selectList();

        request.setAttribute("list", list);
        return "/room/list.jsp";// DispatcherServlet이 쓸거
    }

}
