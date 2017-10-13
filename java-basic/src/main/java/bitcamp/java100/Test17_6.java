
package bitcamp.java100;
//메서드
public class Test17_6{
  // 5) 여러개의 값을 반환하는 방법
  //배열이나 객체
  static int[] m1() {
      int[] values = {100, 90, 80};
      int[] values2;
      values2 = new int[] {100 ,90, 80};
//      return {100, 90, 80};
      return new int[] {100, 90, 80};
      //배열이 리턴되는게아니라 주소가 리턴된다
  }
  public static void main(String[] args) {
      int[] arr =  m1();
      for (int i : arr) {
          System.out.println(i);
      }
  }
}
