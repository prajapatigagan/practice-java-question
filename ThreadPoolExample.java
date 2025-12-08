import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Runnable task = () -> {
                System.out.println(
                        "Task " + taskId + " running in " + Thread.currentThread().getName()
                );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };

            service.execute(task);
        }
        service.shutdown();
    }
}
