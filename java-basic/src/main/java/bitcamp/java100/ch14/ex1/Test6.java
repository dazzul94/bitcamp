package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class Test6 {

    public static void main(String[] args) throws Exception {
//익명클래스
        File file = new File(".");
        File[] files = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {

                if (name.startsWith("."))
                    return true;
                return false;
            }

        });

        for(File f : files) {
            System.out.println(f);
        }


    }

}
