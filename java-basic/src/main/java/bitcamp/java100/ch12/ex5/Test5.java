package bitcamp.java100.ch12.ex5;
//다중 구현이 안된다(예외)-메소드이름이 같고 리턴타입이 다를경우에
//파라미터타입과 개수가 다르거나->오버로딩
//그냥 같은 void m1() 처럼 리턴타입이 같고 파라미터타입과 개수까지 같을 경우엔 OK(둘다 만족시키니까) 
public interface Test5 implements A, E {
    //오버로딩이 안된다! 리턴타입이 다른건 소용이 없다

}
