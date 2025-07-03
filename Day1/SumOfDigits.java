class SumOfDigits {
    public static void main(String[] args) {
//        System.out.println(sumOfDigits(145));
        System.out.println(sumOfFactorials(111));
        System.out.println(sumOfDigits(111));
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {

            int last = n % 10;

            sum += last;

            n /= 10;
        }
        return sum;
    }

    static int sumOfFactorials(int n) {
        int sum = 0;
        while (n != 0) {

            // Extract the last digit
            int last = n % 10;

            // Add last digit to sum
            sum += factorial(last);

            // Remove the last digit
            n /= 10;
        }
        return sum;
    }
}
