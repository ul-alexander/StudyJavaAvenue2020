package Lesson16;

public class Thread1 extends Thread {

    @Override
    public void run() {

        for (int i = 1000; i < 1020; i++) {
            System.out.println(i + "=========");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
