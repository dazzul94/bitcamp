package java100.app.web;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java100.app.domain.Book;
import java100.app.domain.UploadFile;
import java100.app.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    ServletContext servletContext;
    @Autowired
    BookService bookService;

    @RequestMapping("form")
    public String form() {
        return "book/form";
    }

    @RequestMapping("add")
    public String add(Book book, MultipartFile file) throws Exception {

        String uploadDir = servletContext.getRealPath("/download");
        System.out.println(servletContext.getRealPath("/download"));
        String filename = writeUploadFile(file, uploadDir);
        UploadFile uploadPhoto = new UploadFile(filename);
        book.setPhoto(uploadPhoto);

        bookService.add(book);

        return "redirect:list";
    }

    long prevMillis = 0;
    int count = 0;

    // 다른 클라이언트가 보낸 파일명과 중복되지 않도록
    // 서버에 파일을 저장할 때는 새 파일명을 만든다.
    synchronized private String getNewFilename(String filename) {
        long currMillis = System.currentTimeMillis();
        if (prevMillis != currMillis) {
            count = 0;
            prevMillis = currMillis;
        }

        return currMillis + "_" + count++ + extractFileExtName(filename);
    }

    // 파일명에서 뒤의 확장자명을 추출한다.
    private String extractFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");

        if (dotPosition == -1)
            return "";

        return filename.substring(dotPosition);
    }

    private String writeUploadFile(MultipartFile part, String path) throws IOException {

        String filename = getNewFilename(part.getOriginalFilename());
        part.transferTo(new File(path + "/" + filename));
        return filename;
    }

    @RequestMapping("list")
    public String list(@RequestParam(value = "pn", defaultValue = "1") int pageNo,
            @RequestParam(value = "ps", defaultValue = "5") int pageSize,
            @RequestParam(value = "words", required = false) String[] words,
            @RequestParam(value = "oc", required = false) String orderColumn,
            @RequestParam(value = "al", required = false) String align, Model model) throws Exception {

        // UI 제어와 관련된 코드는 이렇게 페이지 컨트롤러에 두어야 한다.
        //
        if (pageNo < 1) {
            pageNo = 1;
        }

        if (pageSize < 5 || pageSize > 15) {
            pageSize = 5;
        }

        HashMap<String, Object> options = new HashMap<>();
        if (words != null && words[0].length() > 0) {
            options.put("words", words);
        }
        options.put("orderColumn", orderColumn);
        options.put("align", align);

        int totalCount = bookService.getTotalCount();
        int lastPageNo = totalCount / pageSize;
        if ((totalCount % pageSize) > 0) {
            lastPageNo++;
        }

        // view 컴포넌트가 사용할 값을 Model에 담는다.
        model.addAttribute("pageNo", pageNo);
        model.addAttribute("lastPageNo", lastPageNo);
        model.addAttribute("list", bookService.list(pageNo, pageSize, options));
        return "book/list";
    }

    @RequestMapping("{no}")
    public String view(@PathVariable int no, Model model) throws Exception {

        model.addAttribute("book", bookService.get(no));
        return "book/view";
    }
    
    @RequestMapping("update")
    public String update(
            Book book, 
            MultipartFile file) throws Exception {
        String uploadDir = servletContext.getRealPath("/download");
        String filename = writeUploadFile(file, uploadDir);
        UploadFile uploadPhoto = new UploadFile(filename);
        book.setPhoto(uploadPhoto);

        bookService.update(book);
        
        return "redirect:list";
    } 

    @RequestMapping("delete")
    public String delete(int no) throws Exception {

        bookService.delete(no);
        return "redirect:list";
    }
}