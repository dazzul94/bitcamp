package java100.app.dao;

import java100.app.domain.UploadFile;

public interface FileDao {

    UploadFile findByBookNo(int no);
    
    void insert(UploadFile file);

    // 게시물의 모든 첨부파일 데이터를 지운다.
    void deleteAllByBookNo(int no);
}
