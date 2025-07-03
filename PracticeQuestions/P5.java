package PracticeQuestions;

public class P5 {
    public static void main(String[] args) {

        String s = "kedar";
        char[] ch = s.toCharArray();

//        for(int i = 0; i < ch.length; i++){
//            int count  = 0;
//            while(count<=i){
//                ch[i]++;
//                count++;
//            }
//            System.out.println(ch[i]);
//        }

        for(int i = 0; i < ch.length; i++){
            char x = ch[i];
            int a = (int)x + i+1;
            System.out.println((char) a);
        }
    }
}
