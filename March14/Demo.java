package March14;

public class Demo {
    public static void main(String[] args) {

        random r = new random("Kedar");
        System.out.println(r.getClass());
        System.out.println(r);
    }
}

class random{

    random(String str){
        System.out.println(str);
    }
}