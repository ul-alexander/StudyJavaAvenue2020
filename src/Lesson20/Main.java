package Lesson20;

import Lesson19.practika.FindFileTaskImpl;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

      /*  Class stringClass = "abc".getClass();

        FindFileTaskImpl task =  new FindFileTaskImpl();

        Class classFindFileTask = task.getClass();*/

        try {
            // Получить информацию о классе Х, создав объект Class
            Class cx = Class.forName("untitled1.X");

            // Создать экземпляр класса Х
            String x = (String) cx.newInstance();

            // Получить и распечатать информацию
            // об интерфейсах класса Х
            Class[] faces = cx.getInterfaces();
            for (int i = 0; i < faces.length; i++)
                System.out.println(faces[i]);

            // Получить и распечатать информацию о методах класса Х
            Method[] methods = cx.getMethods();
            for (int i = 0; i < methods.length; i++)
                System.out.println(methods[i]);

        } catch (Exception e) {


        }
    }
}
