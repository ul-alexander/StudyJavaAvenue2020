package Lesson19.Praktika;

public abstract class TaskImpl implements Task {

    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return 0;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

}
