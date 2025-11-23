// Using ExecutorService
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService
{
    public static void main(String[] args)
    {

        // Create a thread pool with 2 threads
        ExecutorService threads = Executors.newFixedThreadPool(3);

        // Submitting Threads as Runnable

        threads.submit(() -> {
            System.out.println("Task 1 is running in " + Thread.currentThread().getName());
        });

        threads.submit(() -> {
            System.out.println("Task 2 is running in " + Thread.currentThread().getName());
        });
        threads.submit(() -> {
            System.out.println("Task 3 is running in " + Thread.currentThread().getName());
        });

        // Shutdown the threads/executor
        threads.shutdown();
    }
}