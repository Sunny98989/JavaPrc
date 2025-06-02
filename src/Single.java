class Single {
    private static Single s = new Single();

    private Single() {}

    public static Single getInstance() {
        return s;
    }

    void say() {
        System.out.println("im only one");
    }

    public static void main(String[] args) {
        Single obj = Single.getInstance();
        obj.say();
    }
}
