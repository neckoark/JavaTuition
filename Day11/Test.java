package Day11;

public class Test {

    Test(){
        System.out.println("In constructor without parameters");
    }

    Test(String s){
        System.out.println(s);
    }

    int add(int a, int b){
        return a+b;
    }

    int sub(int a, int b){
        return a-b;
    }

    int mul(int a, int b){
        return a*b;
    }

    int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.add(1, 2));
        System.out.println(t.sub(1, 2));
        System.out.println(t.mul(1, 2));
        System.out.println(t.div(10, 5));

        Test test = new Test("Constructer with parameters");
    }
}
