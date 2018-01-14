package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.BookDao;
import java100.app.dao.FileDao;
import java100.app.domain.Book;
import java100.app.domain.UploadFile;
import java100.app.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;
    @Autowired
    FileDao fileDao;

    @Override
    public List<Book> list(int pageNo, int pageSize, Map<String, Object> options) {

        HashMap<String, Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);

        if (options != null) {
            params.putAll(options);
        }

        return bookDao.findAll(params);
    }

    @Override
    public Book get(int no) {
        // 게시물의 첨부 파일 정보를 가져올 때
        // 방법1:
        // => 따로 따로 가져오기
        // Board board = boardDao.findByNo(no);
        // board.setFiles(fileDao.findByBoardNo(no));

        // 방법2:
        // => board 객체에 묶어서 가져오기
        Book book = bookDao.findByNo2(no);

        return book;
    }

    @Override
    public int getTotalCount() {
        return bookDao.countAll();
    }

    @Override
    // @Transactional // XML 설정으로 대체한다.
    public int add(Book book) {

        // insert를 하기 전에는 board의 no 프로퍼티 값은 0이다.
        // insert를 한 후에는 no 프로퍼티에 DB에서 생성한 값이 저장된다.
        int count = bookDao.insert(book);

        // 첨부파일 등록
        this.addFiles(book.getPhoto(), book.getNo());

        return count;
    }

    @Override
    public int update(Book book) {

        int count = bookDao.update(book);

        // 기존의 게시물 첨부파일은 모두 지운다.
        fileDao.deleteAllByBookNo(book.getNo());

        // 다시 게시물 첨부파일을 저장한다.
        addFiles(book.getPhoto(), book.getNo());
        return count;
    }

    @Override
    public int delete(int no) {

        return bookDao.delete(no);
    }

    @Override
    // @Transactional // XML 설정으로 대체
    public void addFiles(UploadFile file, int bookNo) {
        file.setBookNo(bookNo);
        fileDao.insert(file);
    }

}
