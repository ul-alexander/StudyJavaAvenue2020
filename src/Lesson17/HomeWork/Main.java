package Lesson17.HomeWork;

public class Main {


    public static void main(String[] args) {

        String source;
        String destination;
        FileCopyUtilsImpl fileCopy = new FileCopyUtilsImpl();

        //Method
        try {
            source = "./src/Lesson17/images/196913.jpg";
            destination = "./src/Lesson17/HomeWork/files/image.jpg";
            fileCopy.copyFile(source,destination);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Method 1
        try {
            source = "./src/Lesson17/images/196913.jpg";
            destination = "./src/Lesson17/HomeWork/files/image1.jpg";
            fileCopy.copyFile1(source,destination);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Method 2
        try {
            source = "./src/Lesson17/images/196913.jpg";
            destination = "./src/Lesson17/HomeWork/files/image2.jpg";
            fileCopy.copyFile2(source,destination);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
