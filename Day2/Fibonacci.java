public class Fibonacci {
        public static void main(String[] args) {

                for (int i = 0; i <= 5; i++) {
                        System.out.println(Fib(i));
                }
        }

        public static int Fib(int n) {
                if (n == 0) {
                        return 0;
                }
                if (n == 1) {
                        return 1;
                } else {
                        return Fib(n - 1) + Fib(n - 2);
                }
        }
}
