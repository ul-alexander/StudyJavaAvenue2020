package Lesson16.threads;

public class Pevets2 extends Thread {

    @Override
    public void run() {

        //start thread 2
        while (true) {
            //run method wait
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //start song pevets 2
            for (int i = 0; i < 3; i++) {
                System.out.println("-------  FA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //start all threads with this monitor
            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }
        }
    }
}
