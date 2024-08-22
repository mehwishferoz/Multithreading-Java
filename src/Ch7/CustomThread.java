package Ch7;
import Ch4.JavaThreadTest;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomThread extends Thread{
    private boolean shouldExit = false;

    public void setShouldExit(boolean shouldExit) {
        this.shouldExit = shouldExit;
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i < 30; i++) {
                if(shouldExit){
                    break;
                }
                System.out.println("Thread is running!");
                Thread.sleep(200);
            }
            System.out.println("Thread is completed");
        } catch (InterruptedException e) {
            Logger.getLogger(JavaThreadTest.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
