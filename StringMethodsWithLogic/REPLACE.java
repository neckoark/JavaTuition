package StringMethodsWithLogic;

public class REPLACE {
    public static void main(String[] args) {

        String str = "Hello World";
        char[] ch = str.toCharArray();

        char target = 'l';
        char replacement = 'k';

        for(int i=0; i<ch.length; i++){
            if(ch[i] == target){
                ch[i] = replacement;
            }
        }

        for(char c : ch) System.out.print(c);
    }
}
