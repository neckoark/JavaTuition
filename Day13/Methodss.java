package Day13;
import java.util.Scanner;

public class Methodss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        add(a, b);
        sub(a, b);
        mul(a, b);
        div(a, b);
    }

    static void add(int a, int b) {

        System.out.println(a + b);
    }

    static void sub(int a, int b){

        System.out.println(a-b);
    }

    static void mul(int a, int b){

        System.out.println(a*b);
    }

    static void div(int a, int b){

        System.out.println(a/b);
    }
}
