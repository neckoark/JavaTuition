package StringMethodsWithLogic;

public class ISEMPTY {
    public static void main(String[] args) {

        String str = "kedar";
        //System.out.println(str.isEmpty());

        char[] ch = str.toCharArray();
        if(ch.length==0) System.out.println("True");
        else System.out.println("False");
    }
}
