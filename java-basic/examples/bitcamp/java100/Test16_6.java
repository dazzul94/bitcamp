package bitcamp.java100;

public class Test16_6{

    public static void main(String[] args) {
//       for문
        for(int i = 0; i < 5; i++) 
            System.out.println(i);
        System.out.println("-------------------------------------------");
        //변수 여러개 선언가능
        for (int i = 0, j = 0; i < 5; i++, j +=2)
            System.out.printf("%d, %d\n", i, j);
        System.out.println("-------------------------------------------");
        //for문에 선언된 변수는 for문 블록 안에서만(로컬변수)
        int sum = 0;
        for (int i = 0; i < 5; i++)
            sum += i;
        System.out.println(sum);
//        System.out.println(i); 컴파일 오류 i는 for문의 로컬변수다
        System.out.println("-------------------------------------------");
        //여러문장은 블록으로 묶는다
        for (int i = 1; i <= 10; i++) {
            System.out.print("=> ");
            System.out.println(i);
        }
        // break
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        //continue
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;//i가 5면 실행하지 않고 증가문으로 이동한다(5빼고 출력)
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
        //변수 초기화 문장을 생략할 수 있다
        int i = 0;
        for(; i < 5; i++)
            System.out.println(i);
        System.out.println(i);//i변수는 for의 로컬변수가 아니니까 for문밖에서도 사용가능
        System.out.println("-------------------------------------------");
        //증가 감소문을 생략할 수 있다
        i = 0;
        for (; i < 5;) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------------------------------");
        //조건문을 생략
        i = 0;
        for(;;) {
            System.out.println(i);
            i++;
            if (i == 5)
                break;
        }
        System.out.println("-------------------------------------------");
        //배열에서 for문 자주사용
        String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
        for(int index = 0; i < names.length; i++)
            System.out.println(names[index]);
        System.out.println("-------------------------------------------");
        //for 문 중첩하기
        for(int a = 1; a < 5; a++) {//a가 1이면 1번 반복, a가 2면 2번 반복
            for(int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        label1:
            for(int a = 1; a < 5; a++) {//a가 1이면 1번 반복, a가 2면 2번 반복
                for(int b = 0; b < a; b++) {
                    System.out.print("*");
                    if (b == 2)
                        break label1;
                }
                System.out.println(); //실행안해서
            }
        System.out.println();
        System.out.println("-------------------------------------------");
        //구구단
        for(i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
            }
        }
        System.out.println("-------------------------------------------");
        //주어진 숫자를 거꾸로 한개씩 출력하라
        int v = 98761234;
        for(; v > 0; v /= 10) {
            System.out.printf("%d", v % 10);
        }
        System.out.println();
        System.out.println("-------------------------------------------");
    }
}