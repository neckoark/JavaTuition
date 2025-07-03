package LearningGenerics;

public class FindSecondMax {
    public static void main(String[] args) {

        int count = 0;
        int[] a = { 10, 2, 3, 11, 110, 6, 1, 5, 7 };
        int max = -1, secondmax = -1;
        for (int k : a) {
            if (k > max) {
                max = k;
            }
        }

        for (int j : a) {
            if (j > secondmax && j != max) {
                secondmax = j;
            }
        }

        System.out.println(secondmax);
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
