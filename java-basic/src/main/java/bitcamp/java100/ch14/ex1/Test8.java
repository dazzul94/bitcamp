package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;

public class Test8 {

    public static void main(String[] args) throws Exception {
        //익명클래스
        File file = new File(".");
        File[] files = file.listFiles();

        printFiles(file);

    }

    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();

        for (File f : files) {
            System.out.println(f.getCanonicalPath());
            if (f.isDirectory()) {
                printFiles(f);
            }

        } 

    }
}
