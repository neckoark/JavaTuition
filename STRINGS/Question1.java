package STRINGS;
// Given a string "hello world from java", return "java from world hello", but without using .split().

public class Question1 {
    public static void main(String[] args) {

        String s = "hello world from java";

        char[] charr = s.toCharArray();

        int numwords=0;
        for(int i=0;i<charr.length;i++){
            if(charr[i]==' '){
                numwords++;
            }
        }
        numwords++;

        String[] words = new String[numwords];
        for (int i = 0; i < numwords; i++) {
            words[i] = "";
        }

        int k=0;
        for(int i=0;i<charr.length;i++){
            if(charr[i]==' '){
                k++;
            } else{
                words[k] += charr[i];
            }
        }

        for(int i=0;i<words.length;i++){
            //System.out.println(words[i].charAt(0));
            Character.toUpperCase(words[i].charAt(0));
        }

        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }



//        for(int i=0;i<words.length/2;i++){
//            String temp = words[i];
//            words[i] = words[words.length-1-i];
//            words[words.length-1-i] = temp;
//        }
//
//        for(String word : words){
//            System.out.print(word+" ");
//        }
    }
}