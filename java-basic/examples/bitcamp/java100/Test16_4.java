package bitcamp.java100;

public class Test16_4{

    public static void main(String[] args) {
        //while 문 사용법(반복문) true 이면 실행한다 false 가 나올때까지
        int i = 0;
        while (i < 5)
//            System.out.println(++i); //먼저 증가시키고 i 값을 놓는다
            System.out.println(i++); //현재 i값을 놓고 i를 증가시킨다(0부터 뽑고싶음)
        System.out.println("----------------------------------------");
        //여러개의 문장을 반복하기
        
        i = 0;
        while(i < 5) { 
            System.out.print("=> ");
            System.out.println(i);
            i++;
        }
        System.out.println("----------------------------------------");
        i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("----------------------------------------");
        //while 문의 중첩
        i = 1;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }
        //while 문 중첩 연습
        i = 1;
        
        
        while (i <= 5) {
            int count = 5 - i;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
                }
            System.out.println();
            i++;
            System.out.println("--------------------------------------------");
            //별 가운데 정렬
//            i = 1;
//            while (i <= 5) {
//                 count =  - i;
//                while (count > 0) {
//                    System.out.print(" ");
//                    count--;
//                }
//                count = 1;
//                while (count <= i) {
//                    System.out.print("*");
//                    count++;
//                }
//                count = 3 - i;
//                while (count > 0) {
//                    System.out.print(" ");
////                    count--;
////                }
////                System.out.println();
////                i++;
//            }
            
            System.out.println("--------------------------------------------");

            i = 1;
            while (i <= 5) {
                count = (5 - i) / 2;
                while (count > 0) {
                    System.out.print(" ");
                    count--;
                }
                count = 1;
                while (count <= i) {
                    System.out.print("*");
                    count++;
                    }
                System.out.println();
                i += 2;
            }
        }
        System.out.println("--------------------------------------------");
        
        i = 5;
        while (i >= 1) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
                }
            System.out.println();
            i -= 2;
        }
        System.out.println("--------------------------------------------");
        //break 반복문 나가기
        i = 0;
        while (i < 5) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------------------------------");
        //continue
        //반복문 안에서 다음줄로 넘어가지 않고 바로 조건 검사로 이동시키는 명령어
        i = 0;
        while (i < 5) {
            if (i == 3) {
                i++;
                continue; //i++안해주면 계속 3검사함
            }
            System.out.println(i);
            i++;
        }
        System.out.println("--------------------------------------------");
        i = 1;
        while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------");
        //중첩반복문 전체를 빠져나가기-실패
        i = 1;
        while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if(count == 5) {
                    break; //현재 반복문을 탈출한다
                }
                count++;
            }
            System.out.println();
            i++;
        }
        System.out.println("--------------------------------------------");
        //중첩반복문 전체를 빠져나가기(라벨)I
        i = 1;
        label1: {
        while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if(count == 5) {
                    break label1;
                }
                count++;
            }
            System.out.println();
            i++;
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------");
      //중첩반복문 전체를 빠져나가기(라벨)II 블록너무 거추장스러움
        i = 1;
        label1: {
        while (i <= 10) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                if(count == 5) {
                    break label1;
                }
                count++;
            }
            System.out.println();
            i++;
            }
        }
        System.out.println("---------------------------------------------");
        //구구단 2단에서 9단까지
//        -출력예 2 * 1 = 2
//                2 * 2 = 4
        i = 2;
        while (i <= 9) {
            int j = 1;
            while (j <= 9) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
                j++;
            }
            i++;
        }
        System.out.println("---------------------------------------------");
        //주어진 숫자를 뒤에서부터 한개씩 출력하라
        //987654321
        //1 2 3 4 5 6 7 8 9
        i = 987654321;
        while (i > 0) {
            System.out.printf("%d ",i % 10);
            i /= 10;
        }
        System.out.println("---------------------------------------------");
        //주어진 숫자에서 1에서 9까지 등장하는 숫자의개수를 세자
        i = 4885323;
        int[] cnt = new int[10]; 
        System.out.println(cnt[0]);//배열 초기값은 모두 0이기 때문에 초기화안해도 됌
        while (i > 0) {
            cnt[i % 10]++; //i % 10 번방의 값이 1이 증가한다
            i /= 10;
        }
        int x = 0;
        while (x < cnt.length) {
            System.out.printf("%d = %d\n", x, cnt[x]);
            x++;
        }
    }
}