package Day7;

public class CheckPostitive {

    public static void main(String[] args) {
        int[] a = { -3, 4, -5, 7, -2, 0 };
        int negative_count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                //System.out.println(i);
                negative_count++;
            }
        }

        System.out.println(negative_count);
    }
}