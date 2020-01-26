package Lesson3;

public class Main3 {
    public static void main(String[] args) {

        String text = "Hello World!";
        String text2 = "love People pineapple";

        String[] words = text2.split(" ");

        for (String val : words) {
            //System.out.println(val);
        }

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }

        //System.out.println(text.length());


    }
}
