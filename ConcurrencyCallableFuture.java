import java.util.concurrent.*;

public class ConcurrencyCallableFuture {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            System.out.println("Calculating 10 + 20...");
            Thread.sleep(2000);
            return 10 + 20;
        };

        Future<Integer> future = service.submit(task);

        System.out.println("Task submitted, waiting for result...");

        Integer result = future.get();  // waits for result

        System.out.println("Result = " + result);

        service.shutdown();
    }
}

