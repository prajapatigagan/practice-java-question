import java.util.concurrent.*;

public class FixedDelayExample {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Task start: " + System.currentTimeMillis());
            try { Thread.sleep(2000); } catch (Exception ignored) {}
        };

        scheduler.scheduleWithFixedDelay(task, 1, 3, TimeUnit.SECONDS);
    }
}
