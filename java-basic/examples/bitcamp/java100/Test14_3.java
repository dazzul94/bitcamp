package bitcamp.java100;
public class Test14_3{
    public static void main(String[] args) {
    class Bitcamp {
        String name;
        int age;
        String address;
        String tel;
        //더 만들어도됌 메모리 준비하고 안써도됌
        }
    Bitcamp b1;
    b1 = new Bitcamp ();
    b1.name = "김다솔";
    b1.age = 24;
    b1.address = "용인";
    b1.tel = "01035350349"; 

    System.out.printf("%s, %d, %s, %s\n", b1.name, b1.age, b1.address, b1.tel);
    }
}