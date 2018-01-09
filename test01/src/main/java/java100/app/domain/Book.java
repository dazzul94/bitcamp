package java100.app.domain;

import java.sql.Date;
import java.util.List;

//도서 정보 등록
//도서명, 출판사, 출판일, 가격, 설명, 사진
public class Book {
    
    protected int no;
    protected String title;
    protected String publisher;
    protected Date publishedDate;
    protected int price;
    protected String description;
    protected List<UploadFile> files;
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Date getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<UploadFile> getFiles() {
        return files;
    }
    public void setFiles(List<UploadFile> files) {
        this.files = files;
    }
    
    
}
