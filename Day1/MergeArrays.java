
public class MergeArrays {

    public static void main(String[] args) {

        int[] a = {3, 4, 1, 7};
        int[] b = {7, 12, 11, 8, 13};
        int length = a.length + b.length;

        int[] c = new int[length];

        System.arraycopy(a, 0, c, 0, a.length);

        System.arraycopy(b, 0, c, a.length + 0, b.length);
        // System.out.println(c);
        for (int j : c) {
            System.out.println(j);
        }
    }
}
