package Ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadPool pool = new ThreadPool();
        pool.startThreadPool();
    }

    private void startThreadPool() {
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ExecutorService executorService = Executors.newFixedThreadPool(4);
        ExecutorService executorService = Executors.newCachedThreadPool();

        WorkTask task1 = new WorkTask("Task-1");
        WorkTask task2 = new WorkTask("Task-2");
        WorkTask task3 = new WorkTask("Task-3");
        WorkTask task4 = new WorkTask("Task-4");
        WorkTask task5 = new WorkTask("Task-5");
        WorkTask task6 = new WorkTask("Task-6");

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);
        executorService.submit(task6);

        executorService.shutdown();
     }
}
