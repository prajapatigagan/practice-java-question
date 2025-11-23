// Using Lambda Method to Create Thread
import java.io.*;

class UsingLambdaExpressions
{
    public static void main (String[] args)
    {
        // Lambda Thread Created
        Thread thread1 = new Thread(() -> {

            // Operations Performed for thread1
            System.out.println("Lambda Thread running");
        });

        // Running the Thread
        thread1.start();
    }
}