package bitcamp.java100.ch18;

import java.lang.reflect.Field;

public class Test6 {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Z.class;
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.printf("필드타입 : %s,  필드이름: %s\n",field.getType().getName(), field.getName());
        }
        
        System.out.println("---------------------------------------");
        fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.printf("필드타입 : %s,  필드이름: %s\n",field.getType().getName(), field.getName());
        }
    }
}
