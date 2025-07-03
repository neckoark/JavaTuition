package Day10;

public class Constructor2 {
    Constructor2(){
        this("kedar");
    }

    Constructor2(String name){
        System.out.println("My name is " + name);
    }

    public static void main(String[] args) {
        new Constructor2();
    }
}
