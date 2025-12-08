import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ConcurrencyExecutor {
    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(3); // 3 workers

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.execute(() -> {
                System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName());
            });
        }
    }
}
