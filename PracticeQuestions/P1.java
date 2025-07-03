package PracticeQuestions;

public class P1 {
    public static void main(String[] args) {
        String name = "Neha";
        char[] ch = name.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(i==2){
                ch[i]++;
                ch[i]++;

                System.out.println(ch[i]);
                break;
            }
        }
    }
}
