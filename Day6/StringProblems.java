package Day6;

// American Standard Code for Information Interchange
import java.util.Scanner;

public class StringProblems {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Your name is: " + name);

        sc.close();
    }
}
