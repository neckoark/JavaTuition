// Negative becomes positive
// positive becomes negative
//

public class SwitchSign {

    public static void main(String[] args) {

        int[] a = {-3, 4, -1, 7, 8, -9, 3};

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                a[i] = -1 * a[i];
            }
            a[i] = a[i] + 64;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println((char) a[i]);
        }
    }
}
