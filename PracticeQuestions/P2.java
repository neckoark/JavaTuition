package PracticeQuestions;

public class P2 {
    public static void main(String[] args) {

        String s = "Sanjana";
        char[] ch = s.toCharArray();

        int acount = 0;
        for(int i = 0; i < ch.length; i++){
            if(i%2==0 && ch[i]=='a'){
                acount++;
            }
        }
        System.out.println(acount);
    }
}
