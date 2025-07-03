package PracticeQuestions;

public class Nested {
    public static void main(String[] args) {
        Nested obj = new Nested();
        System.out.println(obj.add(1,2));

    }

    int add(int a, int b) {
        int c = a + b;
        return c;
    }

    int sub(int a, int b) {
        int c = a - b;
        return c;
    }
    int mul(int a, int b) {
        int c = a * b;
        return c;
    }
    int div(int a, int b) {
        int c = a / b;
        return c;
    }
}
