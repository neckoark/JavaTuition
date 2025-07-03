public class SubtractOne {
        public static void main(String[] args) {
                int[] a = { 2, 3, 4, 6, 7, 121, 15, 10, 145 };

                for (int i = 0; i < a.length; i++) {
                        a[i] = a[i] - 1;
                }
                System.out.println("All numbers subracted by one: ");
                for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                }
                System.out.println();

                System.out.println("All numbers subtracted by one palindrome");
                for (int i = 0; i < a.length; i++) {
                        if (isPalindrome(a[i])) {
                                System.out.print(a[i] + " ");
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
