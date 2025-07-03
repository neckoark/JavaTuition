package StringMethodsWithLogic;

public class INITCAP {
    public static void main(String[] args) {

        String str = "hello";

        char[] ch = str.toCharArray();

        if (ch[0] >= 'a' && ch[0] <= 'z') {

            char x = 'A';
            for (char j = 'a'; j < ch[0]; j++) {
                x++;
            }
            ch[0] = x;
        }


        // display
        for(char c : ch) System.out.print(c);
    }
}
