package Homework;

public class Patterns {
    public static void main(String[] args) {

        //Pattern1();
        //Pattern2();
        Pattern3();
    }

    public static void Pattern1() {
        /* 
        * * * * *
        * * * *
        * * *
        * *
        * 
        */

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void Pattern2() {
        /* 1 2 3 4 5
        2 3 4 5
        3 4 5
        4 5
        5
        4 5
        3 4 5
        2 3 4 5
        1 2 3 4 5 */

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 5 - i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void Pattern3() {
        int sum = 1;

        for (int i = 0; i < 5; i++) {
            sum = sum + i;
            System.out.print(sum + " ");
        }
    }
}
