package Day10;

public class Constructor1 {
    String name;
    int age;

    Constructor1(String name, int age) {
        this.name=name;
        this.age=age;

        System.out.println(this.name);
        System.out.println(name);

        System.out.println(this.age);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Constructor1 c1=new Constructor1("Kedar",21);
    }
}
