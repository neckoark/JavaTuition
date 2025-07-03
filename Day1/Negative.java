
public class Negative {

    public static void main(String[] args) {

        int[] a = {-3, 4, -1, 7, 8, 9, -3};
        int s = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] < 0) {
                a[i] = s;
            }
            s++;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
