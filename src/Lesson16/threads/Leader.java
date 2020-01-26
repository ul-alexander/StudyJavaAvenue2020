package Lesson16.threads;

public class Leader {

    public static void main(String[] args) {
        System.out.println("Концерт начат   !!!");
        /////////////////////////////////////////
        //Thread 1
        Pevets1 pevets1 = new Pevets1();
        pevets1.start();

        //Thread 2
        Pevets2 pevets2 = new Pevets2();

        //set daemon thread 2
        pevets2.setDaemon(true);

        pevets2.start();

        //stoped here when thread worked
        while (pevets1.isAlive()){

        }
        /////////////////////////////////////////
        System.out.println("Концерт окончен !!!");
    }
}
