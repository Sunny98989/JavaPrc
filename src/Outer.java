public class Outer {
    int x = 5;

    class Inner {
        void show() {
            System.out.println("x is " + x);
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}
