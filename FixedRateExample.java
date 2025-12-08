import java.util.concurrent.*;

public class FixedRateExample {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler =
                Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Running at: " + System.currentTimeMillis());
        };

        scheduler.scheduleAtFixedRate(task, 2, 3, TimeUnit.SECONDS);
    }
}
