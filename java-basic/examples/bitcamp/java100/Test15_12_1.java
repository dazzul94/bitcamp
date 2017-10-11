package bitcamp.java100;

public class Test15_12_1{
    public static void main(String[] args) {
    //비트이동연산자(>>,>>>,<<)
        int v = 87; //0b0000_0000_0000_0000_0000_0000_0101_0111
                //>>1:0b0000_0000_0000_0000_0000_0000_0010_1011|1
                //>>2:0b0000_0000_0000_0000_0000_0000_0001_0101|11
                //>>3:0b0000_0000_0000_0000_0000_0000_0000_1010|111
                //>>4:0b0000_0000_0000_0000_0000_0000_0000_0101|0111
        // >> :오른쪽으로 비트를 이동
        // 왼쪽 빈 자리는 부호 비트로 채운다(양수면 0 , 음수면 1로 채워짐)
        //1비트 오른쪽으로 이동하는 것은 2로 나누는것
        System.out.println(v >> 1);
        System.out.println(v >> 2);
        System.out.println(v >> 3);
        System.out.println(v >> 4);
        
        v = -87; //음수일땐 일종의 반올림
        System.out.println(v >> 1);
        System.out.println(v >> 2);
        System.out.println(v >> 3);
        System.out.println(v >> 4);
        
        //>>>:오른쪽으로 비트 이동, 왼쪽 빈자리는 무조건 0으로 채운다.
        //음수의 경우 양수로 바뀐다, 양수는 그대로
        v = 87; 
        System.out.println(v >>> 1);
        System.out.println(v >>> 2);
        System.out.println(v >>> 3);
        System.out.println(v >>> 4);   
        
        
        v = -87; 
        System.out.println(v >>> 1);
        System.out.println(v >>> 2);
        System.out.println(v >>> 3);
        System.out.println(v >>> 4); 
        
        //<<:왼쪽으로 비트 이동
        v = 87; //2를 곱하는 행위
        System.out.println(v << 1);
        System.out.println(v << 2);
        System.out.println(v << 3);
        System.out.println(v << 4);
        
        v = -87; //음수일때 양수로 바뀔때도 있다, 밀려서 0이 맨앞에 왔을때
        System.out.println(v << 1);
        System.out.println(v << 2);
        System.out.println(v << 3);
        System.out.println(v << 4);
        System.out.println();
        
        for(int i = 0; i < 40; i++) {
            System.out.printf("%32s, %d\n",Integer.toBinaryString(v << i), v << i);
        }
    }
}