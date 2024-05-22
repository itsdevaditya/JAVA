package Learn_String;
import java.util.*;
public class Stringbulders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Krishna");
        System.out.println(sb);
        // insert function
        sb.insert(0, "Radha");
        System.out.println(sb);
    }
}
