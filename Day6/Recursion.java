package Day6;
public class Recursion {
    public static void main(String[] args) {
        recursive(5);
        System.out.println(factorial(15));

    }

    public static void recursive(int n) {
        if (n > 0) {
            System.out.println("Hello world");
            recursive(n - 1);
        } else {
        }
    }

    public static int factorial(int n) {
        if (n >= 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}