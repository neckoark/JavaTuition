package Day5;

public class Question1 {

    public static void main(String[] args) {
        int[] a = { 12, 15, 1, 3, 4, 5, 6 };

        // o/p -> 6 1 3 5
        for (int j : a) {
            if (j % 2 == 0) {
                System.out.print(SOD(j) + " ");
            }
        }
        System.out.println();

        for (int j : a) {
            if (j % 2 != 0) {
                System.out.print(SOD(j) + " ");
            }
        }
        System.out.println();

    }

    public static int SOD(int n) {

        int a = n;
        int b = n;
        int sum = 0;

        while (a != 0) {
            a = a - a % 10;
            sum = sum + b - a;
            a = a / 10;
            b = b / 10;
        }
        return sum;
    }
}