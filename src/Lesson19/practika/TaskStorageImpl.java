package Lesson19.practika;

import java.util.LinkedList;

public class TaskStorageImpl implements TasksStorage {

    private LinkedList<Task> tasks = new LinkedList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {

        /*synchronized (tasks) {
            tasks.add(task);
        }*/

        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
        if (tasks.size() != 0) {
            return tasks.removeFirst();
        }
        return null;
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
