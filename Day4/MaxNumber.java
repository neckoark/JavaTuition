package Day4;

public class MaxNumber {
    public static void main(String[] args) {
        int[] a = { 1, -200, 11, 12, 5, 6, -100 };

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
