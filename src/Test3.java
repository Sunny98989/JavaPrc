import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("x");
        s.add("y");
        s.add("x"); // no duplicate
        for (String val : s) {
            System.out.println(val);
        }
    }
}
