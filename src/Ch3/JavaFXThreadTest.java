package Ch3;

public class JavaFXThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting Thread Name: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            System.out.println("I love JavaFX");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread Completed: " + Thread.currentThread().getName());
    }
}
