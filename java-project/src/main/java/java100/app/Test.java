package java100.app;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        String[] path = "/score/add?name=aaa&kor=100&eng=100&math=100".split("\\?");
        
        for (String s : path) {
            System.out.println(s);
        }
        
        String[] arr = path[1].split("&");
        for (String param : arr) {
            String[] kv = param.split("=");
            System.out.printf("%s : %s\n", kv[0], kv[1]); 
        }
        
        
        String message = JOptionPane.showInputDialog("아무값이나 입력하세요");
    }
}
