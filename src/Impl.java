interface Thing1 {
    void doIt();
}

class Impl implements Thing1 {
    public void doIt() {
        System.out.println("doing it");
    }

    public static void main(String[] args) {
        Impl i = new Impl();
        i.doIt();
    }
}
