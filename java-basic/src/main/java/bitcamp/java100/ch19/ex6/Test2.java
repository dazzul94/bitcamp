package bitcamp.java100.ch19.ex6;

public class Test2 {
    public static void main(String[] args) {
        MyAnnotation2 anno = MyClass2.class.getAnnotation(MyAnnotation2.class);
        String[] names = anno.name();
        int[] ages = anno.age();

        for (String name : names)
            System.out.println(name);
        
        System.out.println("---------------------------------------");
        for (int age : ages)
            System.out.println(age);

    }

}
