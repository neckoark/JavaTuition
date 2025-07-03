package PracticeQuestions;

public class P3 {
    public static void main(String[] args) {

        String name = "kedar";
        char[] ch = name.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int count=0;
            for(char j='a';j<= ch[i];j++){
                count++;
            }
            System.out.print(count+" ");
        }
    }
}
