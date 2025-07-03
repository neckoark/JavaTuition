package Homework.Methods;

//Create Calculator class which have 4 methods add(inti, int j), sub(inti, int j), mul(inti, int j),
//div(inti, int j) with return type double.

import Homework.Arrays.Question1;

public class Question3 {

    double add(int a, int b) {
        return a + b;
    }

    double sub(int a, int b) {
        return a - b;
    }

    double mul(int a, int b) {
        return a * b;
    }

    double div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Question3 q = new Question3();

        System.out.println(q.add(1, 2));
        System.out.println(q.sub(1, 2));
        System.out.println(q.mul(1, 2));
        System.out.println(q.div(1, 2));
    }
}
