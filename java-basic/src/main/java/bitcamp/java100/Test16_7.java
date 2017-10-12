package bitcamp.java100;

public class Test16_7{

    public static void main(String[] args) {
//       for문(레퍼런스) 
        String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
        
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
        
        System.out.println("-------------------------------------------");
        //더 간단한 방법 (끝까지 출력할때)
        for(String n : names)
            System.out.println(n);
        
        System.out.println("-------------------------------------------");
        
        int[] kor = {100, 90, 80, 70, 60, 80};

//        int score;
//        for (score: kor)
//            System.out.println(score);
//반드시 선언과 동시에!! for문 밖에 변수를 선언할 수 없다 score는 for문 안에서만 쓰이는 일시적인 변수
        for (int score : kor)
            System.out.println(score);
        
        System.out.println("-------------------------------------------");
 
        //컬렉션 객체
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");
        list.add("안중근");
        list.add("윤봉길");
        list.add("홍길동");
        list.add("유관순");
        
        for (String n : list)
            System.out.println(n);
    
        System.out.println("-------------------------------------------");
    
        //Set 컬렉션 : 집합, 중복된 값 허용안함 & 들어간 순서대로 못뽑음
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("홍길동");
        set.add("임꺽정");
        set.add("유관순");
        set.add("안중근");
        set.add("윤봉길");
        set.add("홍길동");
        set.add("유관순");
        
        for (String n : set) //n은 일시적인 변수
            System.out.println(n);
        
        System.out.println("-------------------------------------------");
        
        
    }
}