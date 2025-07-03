package StringMethodsWithLogic;

public class LOWERCASE {
    public static void main(String[] args) {

//        String str = "Hello World";
//        str = str.toLowerCase();
//        System.out.println(str);

        String str2 = "Hello World";
        char[] ch = str2.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'A' && ch[i] <= 'Z'){

                char x = 'a';
                for(char j='A'; j < ch[i]; j++){
                    x++;
                }
                System.out.print(x);
            } else System.out.print(ch[i]);
        }
    }
}
