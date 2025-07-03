public class SumOfDigitsInArray {
        public static void main(String[] args) {
                int[] a = { 2, 3, 4, 6, 7, 121, 15, 10, 145 };

                // Print Sum of numbers
                System.out.println("Sum of Digits: ");
                for (int i = 0; i < a.length; i++) {
                        System.out.print(SOD(a[i]) + " ");
                }
                System.out.println();

                // Print All prime numbers
                System.out.println("All Prime numbers: ");
                for (int i = 0; i < a.length; i++) {
                        if (isPrime(a[i])) {
                                System.out.print(a[i] + " ");
                        }
                }
                System.out.println();

                // Print perfect numbers
                System.out.println("All perfect numbers: ");
                for (int i = 0; i < a.length; i++) {
                        if (isPerfect(a[i])) {
                                System.out.print(a[i] + " ");
                        }
                }
                System.out.println();

                // Print number divisible by3
                System.out.println("All numbers divisible by 3: ");
                for (int i = 0; i < a.length; i++) {
                        if (isDivisibleby3(a[i])) {
                                System.out.print(a[i] + " ");
                        }
                }
                System.out.println();

        }

        public static int SOD(int n) {

                int a = n;
                int b = n;
                int sum = 0;

                while (a != 0) {
                        a = a - a % 10;
                        sum = sum + b - a;
                        a = a / 10;
                        b = b / 10;
                }
                return sum;
        }

        public static boolean isPrime(int n) {
                int counter = 1;
                for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                                counter++;
                        }
                }
                return counter == 1;
        }

        public static boolean isPerfect(int n) {
                int sum = 0;
                for (int i = 1; i < n; i++) {
                        if (n % i == 0) {
                                sum = sum + i;
                        }
                }
                return sum == n;
        }

        public static boolean isDivisibleby3(int n) {
                return n % 3 == 0;
        }
}
