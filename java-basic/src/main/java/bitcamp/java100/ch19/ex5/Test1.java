package bitcamp.java100.ch19.ex5;

public class Test1 {
    public static void main(String[] args) {
        MyAnnotation1 anno = MyClass1.class.getAnnotation(MyAnnotation1.class);
        String[] names = anno.name();
        int[] ages = anno.age();

        for (String name : names)
            System.out.println(name);
        
        System.out.println("---------------------------------------");
        for (int age : ages)
            System.out.println(age);

    }

}
