package Day5;

public class CommonElementsInArray {
    public static void main(String[] args) {

        int[] a = { 3, 4, 5, 6 };
        int[] b = { 1, 2, 7, 3, 4 };

        System.out.print("The common elements are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    System.out.print(" " + a[i]);

            }

        }
        System.out.println();

        System.out.print("The unique elements are: ");
        for (int i = 0; i < a.length; i++) {
            int unequal_count = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[j])
                    unequal_count++;
            }

            if (unequal_count == b.length)
                System.out.print(a[i] + " ");
        }
        for (int i = 0; i < b.length; i++) {
            int unequal_count = 0;
            for (int j = 0; j < a.length; j++) {
                if (b[i] != a[j])
                    unequal_count++;
            }

            if (unequal_count == a.length)
                System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}
