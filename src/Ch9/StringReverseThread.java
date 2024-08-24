package Ch8;

import java.util.List;
import  java.util.logging.Level;
import java.util.logging.Logger;

public class StringReverseThread extends Thread{
    private List<Character> names;
    private String message;

    public StringReverseThread(List<Character> names, String message){
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (names) {
            System.out.println("'Names' acquired by " + Thread.currentThread().getName());
            for (int i = 0; i < message.length(); i++) {
                try {
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Logger.getLogger(StringReverseThread.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        System.out.println(names);
    }
}