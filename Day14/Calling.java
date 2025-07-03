package Day14;

import static Day14.Calling2.hello;

public class Calling {

    public static void main(String[] args) {
        Calling2 obj = new Calling2();
        Calling2 obj2 = new Calling2(10);
        hello();
    }

}

class Calling2 {
    static int a = 10;

    Calling2() {
        System.out.println(a);
    }

    Calling2(int a) {
        System.out.println(a);
    }

    static void hello(){
        System.out.println("Hello");
    }
}
