package Day4;

public class Duplicates {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 4, 5, 3, 2, 1 };

        for (int i = 0; i < a.length; i++) {
            /* int count = 0; */
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    a[j] = 0;
                    /* count++; */
                }
            }
            /* System.out.println("Count of " + i + " is : " + count); */
        }

        for (int x : a) {
            System.out.println(x);
        }
    }
}