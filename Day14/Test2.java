package Day14;

public class Test2 {
    Test2(){
        this(50);
    }
    Test2(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Test2 t=new Test2();
        t.Test2();
    }

    void Test2(){
        System.out.println("Hello world");
    }
}
