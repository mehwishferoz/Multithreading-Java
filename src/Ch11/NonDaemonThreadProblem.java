package Ch11;

public class NonDaemonThreadProblem {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e){
                }
            }
        }).start();
        System.out.println("Expecting program shutdown now");
    }
}
