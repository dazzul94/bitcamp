import java.sql.Date;
import java.util.Scanner;

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

//getter and setter
    
    public void print() {
        System.out.printf("%d, %s, %s, %d\n", 
                this.num, 
                this.title, 
                this.regDate.toString(),
                this.viewCount);
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("번호? ");
        this.num = Integer.parseInt(keyScan.nextLine());
        
        System.out.print("제목? ");
        this.title = keyScan.nextLine();
        
        System.out.print("내용? ");
        this.content = keyScan.nextLine();
        
        this.regDate = new Date(System.currentTimeMillis());
    }

    public void printDetail() {
        System.out.printf("제목: %s\n", this.title);
        System.out.printf("내용: %s\n", this.content);
        System.out.printf("등록일: %s\n", this.regDate.toString());
        System.out.printf("조회수: %d\n", ++this.viewCount);
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("제목?(%s) ", this.title);
        String title = keyScan.nextLine();
        if (title.isEmpty()) {
            title = this.title;
        }
        
        System.out.printf("내용? ", this.content);
        String content = keyScan.nextLine();
        
        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            this.title = title;
            this.content = content;
            this.regDate = new Date(System.currentTimeMillis());
            
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }    
    
}
