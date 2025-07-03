package PracticeQuestions;

public class P6 {
    public static void main(String[] args) {

        String s = "small";
        char[] ch = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {

            char x = 'A';
            for(char j = 'a'; j < ch[i];j++){
                x++;
            }
            System.out.println(x);
        }
    }
}
