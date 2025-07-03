package StringMethodsWithLogic;

public class Concatenate {
    public static void main(String[] args) {

        String string1 = "Hello World";
        String string2 = "Hello Java";
        //System.out.println(string1.concat(string2));


        // Merging two character arrays
        int length = string1.length() + string2.length();
        char[] ch = new char[length];

        char[] ch1 = string1.toCharArray();
        char[] ch2 = string2.toCharArray();

        System.arraycopy(ch1, 0, ch, 0, ch1.length);

        System.arraycopy(ch2, 0, ch, ch1.length + 0, ch2.length);

        for(char c : ch){ System.out.print(c); }
    }
}
