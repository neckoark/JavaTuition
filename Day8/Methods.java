package Day8;

public class Methods {

    public static void main(String[] args) {
        add(6,3);

        int result = add();

        int result2 = add(1,2,3);
        System.out.println(result);
        System.out.println(result2);

        addd();
    }

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static int add(){
        int a = 10;
        int b = 20;
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static void addd(){
        System.out.println("voidd");
    }
}
