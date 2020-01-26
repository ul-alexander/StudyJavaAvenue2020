package Lesson16;

public class Thread2 extends Object implements Runnable {
    @Override
    public void run() {

        for (int i = 1000; i < 1020; i++) {
            System.out.println(i + "++++++++++");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
