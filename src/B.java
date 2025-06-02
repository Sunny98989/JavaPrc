class A {
    void sayHi() {
        System.out.println("hi from A");
    }
}

class B extends A {
    void sayBye() {
        System.out.println("bye from B");
    }

    public static void main(String[] args) {
        B b = new B();
        b.sayHi();
        b.sayBye();
    }
}
