package Day7;

public class CharacterArray {

    public static void main(String[] args) {
        /* char[] a = { 'A', 'x', 'C', 'D', 'E', 'a', 'b', 'c' };
        char[] b = { 'a', 'b', 'c', 'd' };
        
        int[] numarray = { 3, 4, 0, 7, 2, 0 }; */
        /* for (int i = 0; i < a.length; i++) {
            System.out.println(((int) Character.toUpperCase(a[i]) - 64));
        }
        
        for (int i = 0; i < b.length; i++) {
            System.out.println(Character.toUpperCase(b[i]));
        }
        
        for (int i = 0; i < numarray.length; i++) {
            System.out.println(numarray[i] + i);
        }
        
        int zero = 0;
        for (int i = 0; i < numarray.length; i++) {
            if (numarray[i] == 0) {
                zero++;
            }
        }
        System.out.println(zero); */
        /* int even_count = 0;
        int odd_count = 0;
        int[] evenarray = { 3, 4, 8, 7, 9, 12, 6, 14 };
        for (int i = 0; i < evenarray.length; i++) {
            if (evenarray[i] % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println(even_count);
        System.out.println(odd_count);
        if (even_count > odd_count) {
            System.out.println("Even count is bigger");
        } else {
            System.out.println("Odd count is greater");
        } */

        int[] a = { 3, 4, 7, 2, 0 };
        int[] b = { 3, 4, 8, 3, 2, 1 };

        /*  for (int i = 0; i < a.length - 1; i++) {
            System.out.println(abs(a[i + 1] - a[i]));
        } */

        for (int i = 0; i < b.length - 1; i++) {
            System.out.println(b[i] + b[i + 1]);
        }

    }

    public static int abs(int n) {
        if (n > 0) {
            return n;
        } else {
            return -1 * n;
        }
    }
}