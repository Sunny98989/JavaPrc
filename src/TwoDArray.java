public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4}
        };

        System.out.println("accessing 1st row, 2nd col: " + arr[0][1]);

        arr[1][0] = 99;
        System.out.println("new val at 2nd row, 1st col: " + arr[1][0]);

        System.out.println("printing full 2d array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
