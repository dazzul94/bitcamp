package bitcamp.java100;
//call by value 와 call by reference
public class Test17_14 {
    //call by value
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n",a, b);
    }
    //call by reference
    static void swap2(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.printf("swap(): array[0] = %d, array[1] = %d\n", array[0], array[1]);
        
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        //호출할때 값을 넘기는 예
        swap(a, b);
        System.out.printf("main(): a = %d, b = %d\n", a, b);
        
        //호출할때 메모리 주소를 넘기는 예
        int[] arr = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        swap2(arr);
        System.out.printf("swap(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
    }      
}
