package Homework.Methods;

public class Calculator {
    int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    int calculateDifference(int number1, int number2) {
        return number1 - number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        int sum = calculator.calculateSum(1, 2);
        System.out.println(sum);

        int difference = calculator.calculateDifference(100, 2);
        System.out.println(difference);
    }
}
