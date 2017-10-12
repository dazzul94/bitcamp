package bitcamp.java100;

public class Test17_1{

    public static void main(String[] args) {
//        조건문 if
        int age = 27;
        
        if (age <= 19) 
            System.out.println("미성년"); else System.out.println("성년");
        
        
        age = 17;
        if (age <= 19) 
            System.out.println("미성년"); 
        else
            System.out.println("성년");
        
        //else문은 선택사항임
        age = 67;
        if (age >= 65) 
            System.out.println("경로우대 대상자입니다");
        
        age = 57;
//        else System.out.println("경로우대 대상자가 아닙니다"); 조건이 없으니 else도 x

        System.out.println("----------------------------------------------");
        //if문에 여러문장 넣기 (블록으로 묶기)
        //안묶으면 첫번째 문장만 if문에 속한다
        age = 27;
        if (age <= 19) 
            System.out.println("미성년입니다");
            System.out.println("청소년 할인을 받을 수 있습니다");
        System.out.println("----------------------------------------------");
        
        age = 27;
        if (age <= 19) {
            System.out.println("미성년입니다");
            System.out.println("청소년 할인을 받을 수 있습니다");
        }
        System.out.println("----------------------------------------------");
        //if문 안에 if문 넣기
        age = 13;
        if (age <= 19) 
            if (age > 13) 
                System.out.println("청소년입니다");
//        if (age > 13) System.out.println("청소년입니다"); <=이거 자체가 한문장
        System.out.println("----------------------------------------------");
        //if문 안에 if else 넣기 
        //else는 항상 가장 가까운 if꺼임, 자바는 들여쓰기에 영향받지 않는다(블록으로써 구분)
        age = 27;
        if (age <= 19) 
            if (age > 13) 
                System.out.println("청소년입니다");
        else 
            System.out.println("성년입니다");
        
        //중괄호로써 구분
        System.out.println("----------------------------------------------");
        age = 27;
        if (age <= 19) { 
            if (age > 13) 
                System.out.println("청소년입니다");
        }
        else 
            System.out.println("성년입니다");
        
        System.out.println("----------------------------------------------");
        //if~else는 한 문장이기 때문에 블록으로 묶지 않아도 된다
        //if가 없는 else 는 존재하지 않는다
        age = 13;
        if (age <= 19) 
            if (age > 13) 
                System.out.println("청소년입니다");
            else 
                System.out.println("어린이 또는 유아입니다");
        
        System.out.println("----------------------------------------------");
        //else문 안에 if 문 두기
        //두번째 else는 이미 첫번째 else가 두번째 if와 묶였기 때문에 알아서 첫번째 if와 묶임
        age = 23;
        if (age <= 19) 
            if (age > 13) 
                System.out.println("청소년입니다");
            else 
                System.out.println("어린이 또는 유아입니다");
            else System.out.println("성년입니다");

        System.out.println("----------------------------------------------");
        //완성!
        age = 72;
        if (age <= 19) 
            if (age > 13) 
                System.out.println("청소년입니다");
            else 
                System.out.println("어린이 또는 유아입니다");
        else 
            if (age < 65)
                System.out.println("성년입니다");
            else 
                System.out.println("노인입니다");
        //블록사용하는 것이 좋다
        System.out.println("----------------------------------------------");
        age = 72;
        if (age <= 19) {
            if (age > 13) 
                System.out.println("청소년입니다");
            else 
                System.out.println("어린이 또는 유아입니다");
        }
        else { 
            if (age < 65)
                System.out.println("성년입니다");
            else 
                System.out.println("노인입니다");
        }
        System.out.println("----------------------------------------------");
        //else문 안에 if문 넣기-이런 모양은 잘 안보임
        age = 67;
        if (age < 8)
            System.out.println("유아");
        else
            if (age < 14)
                System.out.println("어린이");
            else
                if (age < 20)
                    System.out.println("청소년");
                else
                    if (age < 65)
                        System.out.println("성년");
                    else
                        System.out.println("노인");
        System.out.println("----------------------------------------------");
        //else문 안에 if문에 있을때 가독성을 높이기 위해 정리한다(들여쓰기는 가독성을 낮춘다)
        age = 67;
        if (age < 8)
            System.out.println("유아");
        else if (age < 14)
            System.out.println("어린이");
        else if (age < 20)
            System.out.println("청소년");
        else if (age < 65)
            System.out.println("성년");
        else
            System.out.println("노인");
        
        System.out.println("----------------------------------------------");
        //실무에서는 블록을 사용
        age = 67;
        if (age < 8) {
            System.out.println("유아");
        } else if (age < 14) {
            System.out.println("어린이");
        } else if (age < 20) {
            System.out.println("청소년");
        } else if (age < 65) {
            System.out.println("성년");
        } else {
            System.out.println("노인");
        }
    }
}