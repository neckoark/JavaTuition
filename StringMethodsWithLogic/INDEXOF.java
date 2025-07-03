package StringMethodsWithLogic;

public class INDEXOF {
    public static void main(String[] args) {

        String str = "abc";
//        int index = str.indexOf('b');
//        System.out.println(index);

        String str2 = "hello";
        char[] ch = str2.toCharArray();
        char character = 'l';
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == character){
                System.out.println(i);
                break;
            }
        }
    }
}
