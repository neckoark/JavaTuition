package StringMethodsWithLogic;

public class LASTINDEXOF {
    public static void main(String[] args) {

        String s1 = "elf";
        //System.out.println(s1.lastIndexOf('l'));

        char[] ch = s1.toCharArray();

        char character = 'l';

        int index = 0;
        for(int i = 0; i<ch.length; i++){
            if(ch[i] == character){
                index = i;
            }
        }
        System.out.println(index);
    }
}
