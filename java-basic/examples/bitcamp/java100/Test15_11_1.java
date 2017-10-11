package bitcamp.java100;

public class Test15_11_1{
    public static void main(String[] args) {
    //비트연산자(& ,| ,~ , ^) 응용1 (class사용)
    class Privilege {
        boolean isDirectory;
        boolean ownerRead;
        boolean ownerWrite;
        boolean ownerExe;
        boolean groupRead;
        boolean groupWrite;
        boolean groupExe;
        boolean otherRead;
        boolean otherWrite;
        boolean otherExe;
    }
    
        Privilege p1 = new Privilege();
        p1.isDirectory = false;
        p1.ownerRead =  true;
        p1.ownerWrite = true;
        p1.ownerExe = true;
        p1.groupRead = true;
        p1.groupWrite = false;
        p1.groupExe = true;
        p1.otherRead = true;
        p1.otherWrite = false;
        p1.otherExe = true;

//        if(p1.isDirectory) {
//            System.out.print("d");
//        } else {
//            System.out.print("-");
//        }
    //사용권한 검사
        System.out.print(p1.isDirectory ? "d" :"-");
        System.out.print(p1.ownerRead ? "r" :"-");
        System.out.print(p1.ownerWrite ? "w" :"-");
        System.out.print(p1.ownerExe ? "x" :"-");
        System.out.print(p1.groupRead ? "r" :"-");
        System.out.print(p1.groupWrite ? "w" :"-");
        System.out.print(p1.groupExe ? "x" :"-");
        System.out.print(p1.otherRead ? "r" :"-");
        System.out.print(p1.otherWrite ? "w" :"-");
        System.out.print(p1.otherExe ? "x" :"-");
        System.out.println();
        
        //장점: 가독성 높다
        //단점: 메모리 낭비 boolean 개별적이어서 4바이트
    }
}