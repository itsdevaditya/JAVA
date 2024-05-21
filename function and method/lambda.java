// Java 8 program to demonstrate
// a lambda expression
import java.util.Arrays;
import java.util.List;
public class lambda {
    public static void main(String[] args)
    {
        Runnable r
            = ()
            -> System.out.println(
                "Running in Runnable thread");
 
        r.run();
 
        System.out.println(
            "Running in main thread");
    }
}