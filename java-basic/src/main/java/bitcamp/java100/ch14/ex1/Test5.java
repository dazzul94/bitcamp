package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

public class Test5 {

    public static void main(String[] args) throws Exception {
//익명클래스
        File file = new File(".");
        String[] filenames = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {

                if (name.startsWith("."))
                    return true;
                return false;
            }

        });

        for(String names : filenames) {
            System.out.println(names);
        }


    }

}
