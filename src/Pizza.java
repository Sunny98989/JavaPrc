class Pizza {
    String base;
    String topping;

    static class Builder {
        String base;
        String topping;

        Builder setBase(String b) {
            base = b;
            return this;
        }

        Builder setTopping(String t) {
            topping = t;
            return this;
        }

        Pizza build() {
            Pizza p = new Pizza();
            p.base = base;
            p.topping = topping;
            return p;
        }
    }

    void show() {
        System.out.println("Pizza with " + base + " and " + topping);
    }

    public static void main(String[] args) {
        Pizza p = new Pizza.Builder().setBase("thin").setTopping("cheese").build();
        p.show();
    }
}
