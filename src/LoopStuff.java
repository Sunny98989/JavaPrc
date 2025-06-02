public class LoopStuff {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("while loop");
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("do while loop");
        int j = 0;
        do {
            System.out.println(arr[j]);
            j++;
        } while (j < arr.length);

        System.out.println("for-each loop");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
