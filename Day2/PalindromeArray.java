public class PalindromeArray {
        public static void main(String[] args) {

                int a = 1234;
                int pal = 0;
                while (a > 0) {
                        int rem = a % 10;
                        System.out.println(rem);
                        // System.out.println(a);
                        pal = pal * 10 + rem;
                        a = a / 10;

                }
                System.out.println(pal);
        }
}
