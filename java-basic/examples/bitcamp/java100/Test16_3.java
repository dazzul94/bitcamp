package bitcamp.java100;

public class Test16_3{

    public static void main(String[] args) {
        //switch 문
        //조건이 아닌 '값'에 따라 분기 시킬때 유용
        int level = 6;
        switch (level) {
        case 0 : System.out.println("손님"); break;
        case 1 : System.out.println("회원"); break;
        case 2 : System.out.println("관리자"); break;
        default : System.out.println("유효하지 않은 회원입니다");
        }
        //식(expression)으로 가능한 데이터 타입
        // 4바이트를 넘지않는 정수 데이터 타입(byte, short, int, char), String, Enum
        byte b = 10;
        short s = 10;
        int i = 10;
        char c = 10;
        long l = 10;
        float f = 10.f;
        double d = 10;
        boolean bool = true;
        String str = "Hello";
        
        switch (b) {}
        switch (s) {}
        switch (i) {}
        switch (c) {}
//        switch (l) {}
//        switch (f) {}
//        switch (d) {}
//        switch (bool) {}
        switch (str) {}
        
        System.out.println("------------------------------------------------");
        //break;
        //안넣으면 계속 이어서 실행
        level = 2;
        switch (level) {
        case 0 : System.out.println("손님"); 
        case 1 : System.out.println("회원"); 
        case 2 : System.out.println("관리자"); 
        default : System.out.println("유효하지 않은 회원입니다");
        }
        
        //break 활용(일부러)
        String v1 = "";
        switch (v1) {
        case "유아" : 
        case "노인" : System.out.println("무료 승차입니다"); break;
        case "어린이" : 
        case "중학생" : 
        case "고등학생" : 
        case "미성년" : System.out.println("청소년 요금입니다"); break;
        case "성인" : 
        case "외국인" : System.out.println("일반 요금입니다"); break;
        default : System.out.println("요금계산 대상이 아닙니다"); //default는 선택항목
        }
        
        System.out.println("------------------------------------------------");
        switch (10) {
        case 10 : System.out.println("값입니다");
        }
    }
}