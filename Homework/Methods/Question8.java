package Homework.Methods;

public class Question8 {
    void method(int n, char c){
        System.out.println(n+" "+c);
    }

    void method(char c, int n){
        System.out.println(c+" "+n);
    }

    public static void main(String[] args) {

        Question8 q = new Question8();

        q.method(5, 'b');
        q.method('a', 5);
    }
}
