package bitcamp.java100;
public class Test14_2{
    public static void main(String[] args) {
    class Book {
        String bookname;
        String author;
        String factory;
        int pageSize;
        float price;
    }
    Book b1;

    b1 = new Book ();

    b1.bookname = "수레바퀴아래서";
    b1.author = "헤르만 헤세";
    b1.factory = "몰라";
    b1.pageSize = 300;
    b1.price = 10.5f;

    System.out.printf("책제목: %s\n저자: %s\n출판사: %s\n페이지수: %d\n가격($): %.1f\n", b1.bookname, b1.author, b1.factory, b1.pageSize, b1.price);
    }
}