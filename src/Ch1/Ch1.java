package Ch1;
public class Ch1 {
    public static void main(String[] args) throws InterruptedException{
        Thread th = Thread.currentThread();
        System.out.println("Current Thread: " + th.getName());
        th.setName("MyThread");
        System.out.println("Current Thread: " + th.getName());
        Thread.sleep(10_000);
    }
}