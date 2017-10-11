package bitcamp.java100;

public class Test16_1{

    public static void main(String[] args) {
        //문장(statement) - 블록과 변수
        //변수는 블록을 나가면 소멸한다
        int a = 100; {
//            int a = 200;
            int b = 200;
            System.out.println(a);
            System.out.println(b); {
                System.out.println(b);
                int c = 300;
                System.out.println(c);
            }
        }
        System.out.println(a);
//        System.out.println(b);
        int b = 100;
        int c = 300; //안의 블록에서 c를 선언했지만 없어졌으니까 또 선언가능
        System.out.println(c);
    }
}