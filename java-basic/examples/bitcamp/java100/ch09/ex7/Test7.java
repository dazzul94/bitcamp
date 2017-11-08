package bitcamp.java100.ch09.ex7;

import java.util.HashMap;

public class Test7 {

    static class Contact {
        String name;
        String email;
        String tel;

        public Contact(String name, String email, String tel) {
            this.name = name;
            this.email = email;
            this.tel = tel;
        
        
        }

        @Override
        public String toString() {
            return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
        }

        public static void main(String[] args) {


            HashMap<String, Contact> map = new HashMap<>();

            Contact c1 = new Contact("홍길동", "hong@test.com", "1111-1111");
            Contact c2 = new Contact("홍길동2", "hong@test.com", "1111-1111");
            Contact c3 = new Contact("홍길동3", "hong@test.com", "1111-1111");

            map.put("aaa", c1);
            map.put("bbb", c2);
            map.put("ccc", c3);


            System.out.println(map.size());

            //println이 String이 아닌 주소값을 받아서 toString을 자동으로 호출하는데 
            //Object class에서 상속받은 Contact의 toString 메소드는 클래스이름@해시값을 리턴한다.
            //Contact의 toString 메소드를 재정의해야한다.
            
            System.out.println(map.get("aaa").toString());
            System.out.println(map.get("bbb"));
            System.out.println(map.get("ccc"));
            
            String key = new String("aaa");
            System.out.println("aaa" == key); //상수풀에 만들어진 "aaa"와 key의 주소를 비교
            System.out.println("aaa".hashCode()); 
            System.out.println(key.hashCode());
            System.out.println("aaa".equals(key));
            
            System.out.println(map.get(key));
            System.out.println(map.get("aaa"));
        }
    }
}
