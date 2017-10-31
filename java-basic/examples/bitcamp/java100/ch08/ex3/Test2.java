package bitcamp.java100.ch08.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        while(true) {
            Score2 s = new Score2();

            s.setNo(Prompts.inputInt("번호? "));
            s.setName(Prompts.inputString("이름? "));
            s.setKor(Prompts.inputInt("국어? "));
            s.setEng(Prompts.inputInt("영어? "));
            s.setMath(Prompts.inputInt("수학? "));

            list.add(s);

            System.out.println(s.toString());

            if(!Prompts.confirm("계속 하시겠습니까? "))
                break;
        }

    }
}
