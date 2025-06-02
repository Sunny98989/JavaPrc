public class Ops {
    public static void main(String[] args) {
        int a = 10, b = 3;

        // Arithmetic
        System.out.println("add " + (a + b));
        System.out.println("mod " + (a % b));

        // Relational
        System.out.println("a > b: " + (a > b));

        // Logical
        System.out.println("true && false: " + (true && false));

        // Assignment
        int x = 5;
        x += 2;
        System.out.println("x now: " + x);

        // Unary
        System.out.println("++x: " + (++x));
    }
}
