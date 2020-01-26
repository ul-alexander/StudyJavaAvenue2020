package Lesson16.threads;

public class Pevets1 extends Thread {

    private boolean isRun = true;

    @Override
    public void run() {
        //counter
        int count = 0;
        //start thread 1
        while (this.isRun) {
            //counter
            count++;
            //start song pevets 1
            for (int i = 0; i < 3; i++) {
                System.out.println("LA  -------");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // start all thread with this monitor
            synchronized (Monitors.MICROPHONE) {
                Monitors.MICROPHONE.notify();
            }
            //run method wait
            synchronized (Monitors.MICROPHONE) {
                try {
                    Monitors.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //auto stop
            if (count == 4) {
                this.isRun = false;
            }
        }
    }
}
