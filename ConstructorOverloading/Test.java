package ConstructorOverloading;

public class Test {

    String language;
    Test(){
        this.language = "Java";
    }
    Test(String language){
        language = language;
        //System.out.println(language);
    }

    void getName(){
        System.out.println(this.language);
    }


    public static void main(String[] args) {

        Test t = new Test();
        Test t1 = new Test("Python");

        t.getName();
        t1.getName();
    }
}
