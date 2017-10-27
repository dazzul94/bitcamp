package bitcamp.java100.ch08.ex1;
//Gym 회원을 추상화해보자

class Member {
    String name;
    int age;
    float weight;
    float height;
}

public class Test7_1 {
    public static void main(String[] args) {
        Member m = new Member();
        m.name = "홍길동";
        m.age = 20;
        
        
        
        m.weight = 907.0f;
        m.height = 16.0f;
        
        
    }
}
