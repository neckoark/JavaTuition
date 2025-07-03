package PracticeQuestions;

public class P7 {
    public static void main(String[] args) {

        String s = "MuMBai";

        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){

                char x = 'A';
                for(char j = 'a'; j <ch[i]; j++){
                    x++;
                }
                System.out.print(x+" ");
            }

            if(ch[i] >= 'A' && ch[i] <= 'Z'){

                char x = 'a';
                for(char j='A'; j < ch[i]; j++){
                    x++;
                }
                System.out.print(x+" ");
            }
        }
    }
}
