package step8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet11")
public class Servlet11 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = null;
        String age = null;
        String photo1OriginalFilename = null;
        String photo1NewFilename = null;
        String photo2OriginalFilename = null;
        String photo2NewFilename = null;

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        Map<String, FileItem> itemMap = new HashMap<>();
        try {
            List<FileItem> items = upload.parseRequest(req);
            for (FileItem item : items) {
                itemMap.put(item.getFieldName(), item);
            }
                ServletContext context = this.getServletContext();
                String path = context.getRealPath("/step8");

                //
                FileItem fileItem = itemMap.get("photo1");
                photo1NewFilename = getNewFilename(fileItem.getName());
                File file = new File(path + "/" + photo1NewFilename);
                fileItem.write(file);

                fileItem = itemMap.get("photo2");
                photo2NewFilename = getNewFilename(fileItem.getName());
                file = new File(path + "/" + photo2NewFilename);
                fileItem.write(file);
        } catch (Exception e) {
            throw new ServletException(e);

        }

        //
        name = itemMap.get("name").getString("UTF-8");
        age = itemMap.get("age").getString();
        photo1OriginalFilename = itemMap.get("photo1").getName();
        photo2OriginalFilename = itemMap.get("photo2").getName();

        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>파일 업로드 결과</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>파일 업로드 결과</h1>");
        
        out.printf("이름 = %s<br>\n", name);
        out.printf("나이 = %s<br>\n", age);
        
        out.printf("사진1 = %s<br>\n", photo1OriginalFilename);
        out.printf("<img src='%s' width ='200'><br>\n", photo1NewFilename);
        
        out.printf("사진2 = %s<br>\n", photo2OriginalFilename);
        out.printf("<img src='%s' width ='200'><br>\n", photo2NewFilename);
        
        out.println("</body>");
        out.println("</html>");

    }

    long preMillis = 0;
    int count = 0;

    synchronized private String getNewFilename(String filename) { // 한쓰레드만 접근할수 있도록
        long currMillis = System.currentTimeMillis();
        if (preMillis != currMillis) {
            count = 0; // 다시 0으로 바꿈 그시간때의 첫 파일은 0으로 다시 시작
            preMillis = currMillis;
        }
        return currMillis + "_" + count++ + extractFileExtName(filename); // 같은 시간에 호출되면 count만 증가 ex)1000_0, 1000_1
    }

    private String extractFileExtName(String filename) { // 확장자명 찾기
        int dotPosition = filename.lastIndexOf(".");
        if (dotPosition == -1) // 못찾으면
            return "";
        else
            return filename.substring(dotPosition);
    }
}