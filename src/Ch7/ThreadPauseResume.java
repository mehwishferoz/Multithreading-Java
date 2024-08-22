package Ch7;

public class ThreadPauseResume {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();

        //customThread.join(3000); abruptly kills the thread which might lead to data inconsistency
        //Thread.sleep(3000);

        int maxSleep = 6000;
        int slept = 0;

        while(slept < maxSleep){
            Thread.sleep(300);
            slept+=300;
            if(!customThread.isAlive()){
                System.out.println("Thread was completed within 3 seconds");
                System.exit(0);
            }
        } //to close the thread as soon it gets completed

        if(customThread.isAlive()){
            customThread.setShouldExit(true);
            customThread.join();
        }

        System.exit(0);
    }
}
