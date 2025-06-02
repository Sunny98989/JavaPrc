class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Abstract{
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.sound();
        a = new Dog();
        a.sound();
    }
}
