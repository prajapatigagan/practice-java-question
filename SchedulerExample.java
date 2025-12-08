import java.util.concurrent.*;

public class SchedulerExample {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        Runnable task = () -> System.out.println("Task executed!");

        scheduler.schedule(task, 5, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}
