package Day19;

public class random {
    static int a;

    void print(int a){
        System.out.println(a);
        System.out.println(this);
    }

    public static void main(String[] args) {
        random r = new random();
        r.print(10);
        System.out.println(a);
    }
}
