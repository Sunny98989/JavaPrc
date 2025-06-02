abstract class Animal1 {
    abstract void sound();
}

class Cat1 extends Animal1 {
    void sound() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Cat1 c = new Cat1();
        c.sound();
    }
}
