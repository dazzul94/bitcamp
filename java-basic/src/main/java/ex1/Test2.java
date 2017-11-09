package ex1;

import java.io.File;

public class Test2 {
    public static void main(String[] args) throws Exception {
        File file = new File("okok.text");
        
        System.out.println(file.createNewFile());
        System.out.println(file.delete());
        
        File file2 = new File("dir1");
        System.out.printf("디렉토리 생성: %s\n",file2.mkdirs());
        System.out.printf("디렉토리 삭제: %s\n",file2.delete());
        
        File file3 = new File("aaa/bbb/ccc/test.txt");
        System.out.printf("디렉토리 생성 실패: %s\n",file3.mkdir());
        System.out.printf("디렉토리 생성 성공: %s\n",file3.mkdirs());
        
        
    }

}
 