package STRINGS;

public class rsndom {
    public static void main(String[] args) {
        String s = "Shravani";

        char[] ch = s.toCharArray();

        int index = 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == 'a'){
                index = i;
            }
        }
        System.out.println(index);
//        int acount=0;
//        for(int i = 0; i < ch.length; i++){
//            if(ch[i] == 'a'){
//                acount++;
//            }
//        }
//
//        int count=0;
//        for(int i = 0; i < ch.length; i++){
//            if(ch[i] == 'a'){
//                count++;
//            }
//            if(count == acount){
//                System.out.println(i);
//                break;
//            }
//        }
    }
}
