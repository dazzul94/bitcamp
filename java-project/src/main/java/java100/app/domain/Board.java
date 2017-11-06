package java100.app.domain;
import java.sql.Date;

public class Board {
    protected int num;
    protected String title;
    protected String content;
    protected Date regDate;
    protected int viewCount;
    
    public Board() {}

    
    @Override
    public String toString() {
        return "Board [num=" + num + ", title=" + title + ", content=" + content + ", regDate=" + regDate
                + ", viewCount=" + viewCount + "]";
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public Date getRegDate() {
        return regDate;
    }


    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }


    public int getViewCount() {
        return viewCount;
    }


    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    
    public void update() {
    }
        
    
}
