package Ch6;
import Ch5.CalculatorRunnable;
public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread();
        CalculatorRunnable runnable = new CalculatorRunnable(30000000000L);

        Thread thread = new Thread(runnable);
        thread.setName("high priority");
        thread.start();
        thread.join(5_000);
//        while (thread.isAlive()){
//            System.out.println("Thread is active");
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("Thread is completed.");
        System.out.println("Join completed"); // no elapsed time message because the process got killed after 5ms before it could complete
        System.exit(0);
    }
}
