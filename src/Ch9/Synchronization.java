package Ch8;

import java.util.List;
import  java.util.ArrayList;

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        List<Character> list = new ArrayList<>();
        Thread thread1 = new StringReverseThread(list, "MEHWISH");
        Thread thread2 = new StringReverseThread(list, "aman");
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
