public class OOPS {

//    enum Day {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }

    static class Student {
        String name = "Sunny";
        int age = 22;

        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";              //-----------------------
        }
    }

    public static void main(String[] args) {
//        byte b = 10;
//        short s = 200;
//        int i = 1000;
//        long l = 100000000L;
//        float f = 5.75f;
//        double d = 123.456;
//        char c = 'A';
//        boolean bool = true;
//
//        Integer wi = Integer.valueOf(99);
//        Double wd = Double.valueOf(3.1415);
//
//        String str = "Hello, Java!";
//        int[] arr = {1, 2, 3, 4};

        Student studentObj = new Student();

//        Object obj = "This is an object (String under the hood)";
//        Object num = 999;
//
//        Day today = Day.FRIDAY;
//
//        System.out.println("byte: " + b);
//        System.out.println("short: " + s);
//        System.out.println("int: " + i);
//        System.out.println("long: " + l);
//        System.out.println("float: " + f);
//        System.out.println("double: " + d);
//        System.out.println("char: " + c);
//        System.out.println("boolean: " + bool);
//
//        System.out.println("Wrapper Integer: " + wi);
//        System.out.println("Wrapper Double: " + wd);

//        System.out.println("String: " + str);
//        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Custom Object (Student): " + studentObj); //--------------------------------------
//        System.out.println("Object (String): " + obj);
//        System.out.println("Object (Integer): " + num);
//
//        System.out.println("Enum Value (Day): " + today);
//
//        String nullStr = null;
//        Student nullStudent = null;
//        System.out.println("Null String: " + nullStr);
//        System.out.println("Null Object: " + nullStudent);
    }
}
