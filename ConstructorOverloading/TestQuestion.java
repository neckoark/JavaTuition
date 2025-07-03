package ConstructorOverloading;

public class TestQuestion {

    int a;

    TestQuestion(){
        this(5);
    }

    TestQuestion(int a){
        this.a = a;
    }

    String even(){
        int b = a;
        if(b%2==0){
            return "even";
        } else {
            return "odd";
        }
    }

    int factorial(){
        int c = a;
        int fact=1;
        do {
            fact*=c;
            c--;
        } while(c>0);
        return fact;
    }

    int sumofDigits(){
        int d = a;

        int a = d;
        int b = d;
        int sum = 0;

        while (a != 0) {
            a = a - a % 10;
            sum = sum + b - a;
            a = a / 10;
            b = b / 10;
        }
        return sum;
    }



    public static void main(String[] args) {
        TestQuestion t = new TestQuestion(3);

        System.out.println(t.even());
        t.factorial();
        t.sumofDigits();

    }
}
