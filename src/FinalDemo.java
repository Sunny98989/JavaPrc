final class A9 {
    final int x = 10;

    final void show() {
        System.out.println("final method");
    }
}

// class B extends A {} // not allowed

public class FinalDemo {
    public static void main(String[] args) {
        A9 a = new A9();
        System.out.println("x is " + a.x);
        a.show();
        // a.x = 20; // not allowed
    }
}
