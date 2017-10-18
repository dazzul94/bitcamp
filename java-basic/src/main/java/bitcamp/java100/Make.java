package bitcamp.java100;

public class Make{

    public static void main(String[] args) {
        // => for (:) 문의 용도 및 기본 문법
        // - 배열이나 콜렉션 객체의 값을 꺼낼 때 적합하다.
        // - for(레퍼런스 선언 : 배열 또는 콜렉션 객체) 명령문;
        
        String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
        
        for (String n : names) 
            System.out.println(n);
        
        System.out.println("------------------");
    }
}
        