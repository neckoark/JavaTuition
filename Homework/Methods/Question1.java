package Homework.Methods;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        MyDate.setDate();
        MyDate.printDate();


    }


}

class MyDate {
    static int day, month, year;

    static void setDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        day = sc.nextInt();
        System.out.println("Enter month: ");
        month = sc.nextInt();
        System.out.println("Enter year: ");
        year = sc.nextInt();
    }

    static void printDate(){
        System.out.println(day + "." + month + "." + year);
    }
}
