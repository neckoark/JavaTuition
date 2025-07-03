package PracticeQuestions;

public class P4 {
    public static void main(String[] args) {

        String name = "kedar";
        char[] ch = name.toCharArray();

        for(int i = 0; i < ch.length/2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = temp;
        }

        for(char x: ch) System.out.print(x+" ");
    }
}
