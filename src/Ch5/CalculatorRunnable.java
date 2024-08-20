package Ch5;

public class CalculatorRunnable implements Runnable{
    long value;
    public CalculatorRunnable(long value) {
        this.value = value;
    }
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        long sum = 0;
        for (long i = 0; i < value; i++) {
            sum+=i;
        }
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Elapsed time: " + endTime + " for thread: " + Thread.currentThread().getName());
    }
}
