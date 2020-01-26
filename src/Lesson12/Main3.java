package Lesson12;

import java.util.HashMap;

public class Main3 {

    //Точка старта программы
    public static void main(String[] args) {

        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Яблоко", 5);
        fridge.put("Ананас", 7);
        fridge.put("Груша", 3);
        fridge.put("Тыква", 1);
        fridge.put("Огурец", 10);

        //Распечатка ассоциативного массива Map
        System.out.println(fridge);
        System.out.println("=====================");
        int sum = 0;
        for (String value : fridge.keySet()) {
            sum = sum + fridge.get(value);
            //print key => value
            System.out.println("Ключ: " + value + " Значение: " + fridge.get(value));
        }
        System.out.println("=====================");
        System.out.println("Сумма Значений Ассоциативного массива");
        System.out.println("=====================");
        System.out.println(sum);

        //Добавление в ассоциативный массив
        //fridge.put("Груша", 8); //перезатирает
        fridge.put("Груша", 8 + fridge.get("Груша")); //прибавляем к имеющеемся

        System.out.println("==========================");
        for (String key : fridge.keySet()) {
            System.out.println("Ключ: " + key + " Значение: " + fridge.get(key));
        }

        //нельзя достать ключ только значения
        System.out.println("===========================");
        for (Integer key : fridge.values()) {
            System.out.println(key);
        }
    }
}
