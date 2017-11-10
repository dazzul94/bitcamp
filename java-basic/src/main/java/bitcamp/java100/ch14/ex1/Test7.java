package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;

public class Test7 {

    public static void main(String[] args) throws Exception {
//익명클래스
        File file = new File(".");
        File[] files = file.listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {

                if (pathname.getName().startsWith("."))
                    return true;
                return false;
            }

        });

        for(File f : files) {
            System.out.println(f);
        }


    }

}
