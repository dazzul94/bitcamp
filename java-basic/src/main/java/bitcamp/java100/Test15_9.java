package bitcamp.java100;  
public class Test15_9{
    public static void main(String[] args) {
    //조건연산자
        //(조건)?식1:식2;
        int age = 27;
        String result = (age <= 19)? "미성년" : "성년";
        System.out.println(result);
    }
}