class Animals {
    void sound() {
        System.out.println("some sound");
    }
}

class Dogs extends Animals {
    void sound() {
        System.out.println("woof");
    }
}

class Cats extends Animals {
    void sound() {
        System.out.println("meow");
    }
}

class AnimalFactory {
    static Animals getAnimals(String t) {
        if (t.equals("dog")) return new Dogs();
        else return new Cats();
    }

    public static void main(String[] args) {
        Animals a = AnimalFactory.getAnimals("dog"); //match above one :]
        a.sound();
    }
}
