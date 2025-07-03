package Day10;

public class Test {
    static int a;

    Test(int a){
        Test.a = a;
        System.out.println(a);
        System.out.println(Test.a);
    }

    public static void main(String[] args) {
        //int a = 10;

        Test test = new Test(20);
        System.out.println(a);
    }
}
