package Lesson15;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(900);
            System.out.println("Успешно");
        } catch (Exception e) {
            System.out.println("Некоректный возраст");
        }
        System.out.println("The END");
    }
}
