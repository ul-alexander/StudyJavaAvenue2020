package Lesson16;

public class Main {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        thread1.start();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("===============" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
