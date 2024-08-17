package Ch4;

public class SingleThread {
    public static void main(String[] args) throws InterruptedException {

        createJavaThread();
        createJavaFXThread();
        createAndroidThread();

//        for (int i = 0; i < 10; i++){
//            System.out.println("I love Java");
//            Thread.sleep(200);
//        }
//        for (int i = 0; i < 10; i++){
//            System.out.println("I love JavaFX");
//            Thread.sleep(200);
//        }
//        for (int i = 0; i < 10; i++){
//            System.out.println("I love Android");
//            Thread.sleep(200);
//        }
    }
    private static void createJavaThread() {
        new JavaThreadTest().start();
    }
    private static void createJavaFXThread() {
        new JavaFXThreadTest().start();
    }
    private static void createAndroidThread() {
        AndroidThreadTest threadTest = new AndroidThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("ANDROID_THREAD");
        th.start();
    }
}
