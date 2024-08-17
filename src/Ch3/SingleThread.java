package Ch3;

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

    private static void createAndroidThread() {
        AndroidThreadTest threadTest = new AndroidThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("ANDROID_THREAD");
        th.start();
    }

    private static void createJavaFXThread() {
        JavaFXThreadTest threadTest = new JavaFXThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("JAVAFX_THREAD");
        th.start();
    }

    private static void createJavaThread() {
        JavaThreadTest threadTest = new JavaThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("JAVA_THREAD");
        th.start();
    }
}
