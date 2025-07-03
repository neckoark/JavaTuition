package Day15;

class Test {
    static int a = 10;

    public static void main(String[] args) {

        Test1 t1 = new Test1();
        t1.print(a);
        Test t= new Test();
        t.print(a);
    }

    void print(int a) {
        System.out.println(a);
        System.out.println(Test.a);
    }

}

public class Test1{
    static int a ;

    void print(int a){
        System.out.println(a);
        System.out.println(Test1.a);
    }

}
