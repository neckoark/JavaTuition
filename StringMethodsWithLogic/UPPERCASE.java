package StringMethodsWithLogic;

public class UPPERCASE {
    public static void main(String[] args) {

        //String str = "kedar123";
        //System.out.println(str.toUpperCase());

        String str2 = "kedar123";
        char[] ch = str2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z'){

                char x = 'A';
                for(char j = 'a'; j <ch[i]; j++){
                    x++;
                }
                System.out.print(x);
            } else System.out.print(ch[i]);
        }

    }
}
