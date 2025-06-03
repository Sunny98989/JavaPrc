import java.util.Scanner;

public class InputTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: String
        System.out.print("enter string: ");
        String str = sc.nextLine();

        // Input: int
        System.out.print("enter int: ");
        int i = sc.nextInt();

        // Input: float
        System.out.print("enter float: ");
        float f = sc.nextFloat();

        // Input: double
        System.out.print("enter double: ");
        double d = sc.nextDouble();

        // Input: long
        System.out.print("enter long: ");
        long l = sc.nextLong();

        // Input: short
        System.out.print("enter short: ");
        short s = sc.nextShort();

        // Input: byte
        System.out.print("enter byte: ");
        byte b = sc.nextByte();

        // Input: boolean
        System.out.print("enter boolean: ");
        boolean bool = sc.nextBoolean();

        // Input: char (take as String and grab first char)
        System.out.print("enter char: ");
        char ch = sc.next().charAt(0);

        // print everything
        System.out.println("string: " + str);
        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println("short: " + s);
        System.out.println("byte: " + b);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + ch);
    }
}
