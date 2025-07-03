public class CheckPalindrome {
        public static void main(String[] args) {
                //
                /*
                 * for (int i = 1; i < 101; i++) {
                 * if (isPalindrome(i)) {
                 * System.out.println("The number " + i + " Is a palindrome");
                 * }
                 * }
                 */

                int i = 1;
                while (i < 101) {
                        if (isPalindrome(i)) {
                                System.out.println("The number " + i + " is a palindrome");
                        }
                        i++;
                }

                int[] a = { 2, 12, 15, 121, 4, 5, 7, 22 };
                for (int j = 0; j < a.length; j++) {
                        if (isPalindrome(a[j])) {
                                System.out.print(a[j] + " ");
                        }
                }
        }

        public static boolean isPalindrome(int n) {
                int pal = 0;
                int original = n;
                while (n > 0) {
                        int rem = n % 10;

                        pal = pal * 10 + rem;

                        n = n / 10;
                }

                return original == pal;
        }
}
