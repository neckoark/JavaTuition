import java.util.Scanner;

public class PalindromeHundred {
        public static void main(String[] args) {
                try (Scanner sc = new Scanner(System.in)) {
                        int ll, ul;
                        System.out.println("Enter lower limit: ");
                        ll = sc.nextInt();
                        System.out.println("Enter upper limit : ");
                        ul = sc.nextInt();
                        int total = 0;
                        for (int i = ll; i <= ul; i++) {
                                int a = i, rev = 0, num = a;

                                while (a > 0) {
                                        int rem = a % 10;
                                        rev = rev * 10 + rem;

                                        a = a / 10;
                                }

                                if (rev == num) {
                                        total = total + num;
                                        System.out.println(num);
                                }

                        }
                        System.out.println("Total is: " + total);
                }

        }
}
