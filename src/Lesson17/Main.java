package Lesson17;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {

        //one
        File file = new File("./src/Lesson17/files/qqqqqqqqq");

        //file and folder for java odno i toshe
        if (!file.exists()) {
            file.mkdir();
        }
        //two
        File file2 = new File("../");
        File[] filesList = file2.listFiles();

        for (File f : filesList) {
            if (f.isDirectory()) {
                System.out.println("Папка " + f.getName());
                for (File f2 : f.listFiles()) {
                    if (f2.isDirectory()) {
                        System.out.println("Папка " + f2.getName());
                    } else {
                        System.out.println("Файл  ----- " + f2.getName());
                    }
                }
                //System.out.println(f.getName());
            } else {
                System.out.println("Файл  ----- " + f.getName());
            }
        }
        //////////////////
        System.out.println("=======================================");
        //three
        File file3 = new File("../../");
        File[] filesFilter = file3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });

        for (File f : filesFilter) {
            System.out.println("Имя папки : " + f.getName() + "  Путь папки : " + f.getAbsolutePath());
        }
    }
}
