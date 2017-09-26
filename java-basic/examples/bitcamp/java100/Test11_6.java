package bitcamp.java100;
public class Test11_6 {
    public static void main(String[] args) {
        System.out.println(-21_4748_3648); //4바이트 가장 작은 정수값
        System.out.println(21_4748_3647); //4바이트 가장 큰 정수값

        // System.out.println(-21_4748_3649); integer number too large
        // System.out.println(21_4748_3648);

        System.out.println(-21_4748_3649l);
        System.out.println(21_4748_3648L); //주로 대문자, 숫자 1과 헷갈리니까

        System.out.println(10); //4바이트 정수값-STANDARD
        System.out.println(10L); //8바이트 정수값

        System.out.println(-922_3372_0368_5477_5808L);//8바이트 가장 작은 정수값
        System.out.println(922_3372_0368_5477_5807L);//8바이트 가장 큰 정수값
    }
}