package Lesson4;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {

        for (int day = 0; day <= 30; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int minute = 0; minute < 60; minute++) {
                    for (int second = 0; second < 60; second++) {
                        //System.out.println("Прошло " + day + " дня , 5 часов , 40 минут , 29 секунд");

                        // переменная %d - число %s - строка
                        System.out.printf("Прошло %d дня , %d часов , %d минут , %d секунд", day, hour, minute, second);
                        System.out.println();

                        //Поток ,замедление на 1 секунду
                        Thread.sleep(1000);

                    }
                }
            }
        }
    }
}
