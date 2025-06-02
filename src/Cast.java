public class Cast {
    public static void main(String[] args) {
        int a = 10;
        double d = a; // widening
        System.out.println("double d: " + d);

        double x = 9.99;
        int y = (int) x; // narrowing
        System.out.println("int y: " + y);
    }
}
