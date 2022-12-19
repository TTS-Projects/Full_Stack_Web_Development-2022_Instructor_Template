package concurrency;
public class MyClass {
    private long c1 = 2;
    private long c2 = 2;
    private Object lock1 = new Object(); //moneyBox1
    private Object lock2 = new Object(); // moneyBox2

    public void inc1() {
        synchronized(lock1) {//acquires the key to bank
            c1++;  //perform increase in my money
            synchronized(lock2) {
            	c2++;
            }
        }
    }

    public void inc2() {
        synchronized(lock2) {//mace acquires moneyBox2
            c2++;//increases his balance
            synchronized(lock1) { //mace 'tries' to access moneyBox1
            	c1++;
            }
        }
    }
}