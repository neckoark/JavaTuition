package pattern;

public class Combination {
        public static void main(String[] args) {
                int num_rows = 10;

                for (int i = 0; i < num_rows; i++) {

                        for (int k = 0; k < num_rows - i; k++) {
                                System.out.print("  ");
                        }

                        for (int j = 0; j <= i; j++) {
                                System.out.printf("%4d ", Combination(i, j));
                        }
                        System.out.println();
                }

        }

        public static int factorial(int n) {
                int s = 1;
                for (int i = 1; i < n + 1; i++) {
                        s = s * i;
                }
                return s;
        }

        public static int Combination(int n, int r) {
                return factorial(n) / (factorial(r) * factorial(n - r));
        }
}
