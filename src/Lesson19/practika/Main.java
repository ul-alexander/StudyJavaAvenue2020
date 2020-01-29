package Lesson19.practika;


public class Main {
    public static void main(String[] args) {

        CopyFileTask task1 = new CopyFileTaskImpl();
        //task1.setFrom("Занятие - 12, 16_12_2019, Java - 10");

        CopyFileTask task4 = new CopyFileTaskImpl();

        //FindFileTaskImpl task5 = new FindFilesTaskImpl
        //FindFileTaskImpl task8 = new FindFileTaskImpl("D://",".jpg");

        TaskStorageImpl storage = new TaskStorageImpl();
       /* storage.add(task2);
        storage.add(task1);
        storage.add(task5);
        storage.add(task6);
        storage.add(task3);
        storage.add(task4);
        storage.add(task8);
        storage.add(task7);*/

    TaskExecutor executor1 = new TaskExecutorImpl();
    TaskExecutor executor2 = new TaskExecutorImpl();
    TaskExecutor executor3 = new TaskExecutorImpl();

    executor1.setStorage(storage);
    executor2.setStorage(storage);
    executor3.setStorage(storage);

    executor1.start();
    executor2.start();
    executor3.start();

    }
}
