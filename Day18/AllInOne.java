package Day18;
import java.util.Scanner;

public class AllInOne {
    static {
        System.out.println("static block gets executed first");
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(AllInOne.statint);
        AllInOne allInOne = new AllInOne();
        AllInOne allInOne1 = new AllInOne("Para constructor");
//        allInOne.printName("Kedar");
//        allInOne.localvar();
        System.out.println(allInOne.sub(5, 6));
    }

    static int statint = 10;
    String str = "Kedar";
    AllInOne(){
        String str = "Satara";
        str=this.str; // Referencing global variable
        System.out.println("All in one constructor " + str);
    }

    AllInOne(String str){
        System.out.println("All in one class and "+str);
    }

    void printName(String name){
        System.out.println(name);
    }

    void localvar(){
        int local = 100;
        System.out.println(local);
    }

    int sub(int a, int b){
        return a - b;
    }
}

