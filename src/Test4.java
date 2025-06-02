import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("a", "apple");
        m.put("b", "banana");
        for (String k : m.keySet()) {
            System.out.println(k + " = " + m.get(k));
        }
    }
}
