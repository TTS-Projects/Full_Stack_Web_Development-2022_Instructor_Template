package concurrency;

public class SynchronizedCounter {
    private int c = 0;
    private int d = 0;
    //both d and c are never used together

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}