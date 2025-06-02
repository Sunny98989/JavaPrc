interface Thing {
    void doStuff();
}

class Stuff implements Thing {
    public void doStuff() {
        System.out.println("doing stuff");
    }

    public static void main(String[] args) {
        Stuff s = new Stuff();
        s.doStuff();
    }
}
