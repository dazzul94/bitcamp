package bitcamp.java100;
public class Test18_5 {
    //String 의 기타 인스턴스 메소드
    //String은 immutable하다
    public static void main(String[] args) throws Exception {//gerBytes떄매
       //replace
       String s1 = "ABC가각간"; 
       
       String s2 = s1.replace("BC","하하하");
       
       System.out.println(s1); //immutable object
       System.out.println(s2);

       //charAt
       System.out.println(s1.charAt(4)); //0부터 시작(배열이니까)
       
       s1 = "ABBCDEBBFGH";
       //indexOf
       System.out.println(s1.indexOf("BB"));
       //lastIndexOf
       System.out.println(s1.lastIndexOf("BB"));//시작인덱스
       //substring
       System.out.println(s1.substring(3));
       //substring 추출할 문자열의 시작 인덱스와 끝인덱스
       System.out.println(s1.substring(3, 6)); //끝인덱스는 포함하지 않는다
       
       
       s1 = "홍길동";
       //starsWith
       System.out.println(s1.startsWith("홍길"));
       System.out.println(s1.startsWith("길"));
       
       //endsWith
       System.out.println(s1.endsWith("동"));
       System.out.println(s1.endsWith("길"));
       
       s1 = "홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
      //contains
       System.out.println(s1.contains("꺽정"));
       System.out.println(s1.contains("김꺽정"));
       
       String s3 = "ABC";
       String s4 = "가각간";
       //concat
       System.out.println(s3.concat(s4));
       System.out.println(s3);
       System.out.println(s4);

       s3 = new String("탕수육");
       s4 = new String("탕수육2");
       String s5 = new String("탈수육");
       String s6 = new String("탕수육");
       //String1.compareTo(String2)
       //두 문자열을 비교하여 
       //같은 문자열이면 0
       //String1이 String2보다 알파벳 가나다 순서에서 앞서면 음수를 리턴한다
       //String1이 String2보다 알파벳 가나다 순서에서 뒤면 양수를 리턴한다
       System.out.println(s3.compareTo(s6));
       System.out.println(s3.compareTo(s4));
       System.out.println(s3.compareTo(s5));
    
       //isEmpty
       s1 = "홍길동";
       s2 = ""; //빈문자열
       s3 = null; //인스턴스 없음
       System.out.println(s1.isEmpty());
       System.out.println(s2.isEmpty());
//       System.out.println(s3.isEmpty());
       
       //length()
       System.out.println(s1.length());
       System.out.println(s2.length());
//       System.out.println(s3.length());
       
       //split
       s1 = "홍길동,유관순,,임꺽정,안중근,윤봉길,이육사,윤동주";
       String[] arr = s1.split(",");
       for (String s : arr) {
           System.out.print(s);
           System.out.print("-");
       }
       System.out.println();
       
       arr = s1.split(" ");
           System.out.print(arr.length);
           System.out.print(arr[0]);
           
       s1 = "";
       arr = s1.split(",");
       System.out.print(arr.length);
       System.out.print(arr[0]);
   
       System.out.println();
       
       s1 = "Hong Gil Dong";
       //toLoweCase
       System.out.println(s1.toLowerCase());
       //toUppercase
       System.out.println(s1.toUpperCase());
       System.out.println(s1);
       
       //trim
       //공백 : white space = space, tab, new line
       s1 = "  \t홍\t길   \n동 입니다. \n\n\n\n\n\t\t\t\t ";
       System.out.print(">");
       System.out.print(s1.trim());
       System.out.println("<");
       
       s1 = "ABC\n가각간\n똘똠똥";
       
       //getBytes
       //해당 문자열을 바이트 배열로 만들어 리턴한다
       //바이트 배열에 저장되는 값은 JVM에 설정된 문자집합의 코드 값이다
       //JVM에 설정된 문자 집합이 없으면, OS의 기본문자 집합을 사용한다
       byte[] bytes = s1.getBytes();
       for (byte b : bytes) {
           System.out.print(Integer.toHexString(b & 0x00ff));
           System.out.print(" ");
       }
            System.out.println(); 
            //java-basic >java -cp bin -Dfile.encoding=utf8 bitcamp.java100.Test18_5

       //gerBytes("문자집합") -OS에 상관없이 byte배열로 바꿀 수 있다
            bytes = s1.getBytes("UTF-8");
            for (byte b : bytes) {
                System.out.print(Integer.toHexString(b & 0x00ff));
                System.out.print(" ");
            }
                 System.out.println(); 
               //java-basic >java -cp bin bitcamp.java100.Test18_5
       //valueOf
       s1 = String.valueOf(true);
       s2 = String.valueOf(3.14);
       s3 = String.valueOf(100);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       
       // 문자열을 다루는 특별한 연산자 '+'
       // 두 문자열을 연결하여 새 String 인스턴스를 만든다
       s1 = "ABC";
       s2 = "가각간";
       s3 = s1 + s2;
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
    }      
}
