package bitcamp.java100.ch09.ex6;

public class Test1 {
    
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        bookStack.push(new Book());

        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        Book b3 = bookStack.pop();
        
        
        ScoreStack scoreStack = new ScoreStack();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        Score s3 = scoreStack.pop();
        
 
        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();
        Contact c3 = contactStack.pop();
    
    }
}
