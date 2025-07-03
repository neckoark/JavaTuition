package Day5;

public class AreArraysEqual {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5 };

        if (a.length == b.length) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    count++;
                } else {
                    System.out.println("Arrays are not equal");
                    break;
                }
            }
            if (count == a.length) {
                System.out.println("Arrays are equal");
            }
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}