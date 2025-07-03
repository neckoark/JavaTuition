package STRINGS;

public class Random {
    public static void main(String[] args) {

        String s = "This is a java program and python";
        char[] ch = s.toCharArray();

        int numwords = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                numwords++;
            }
        }
        numwords++;

        String[] strarr = new String[numwords];

        for (int i = 0; i < numwords; i++) {
            strarr[i] = "";
        }

        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                index++; // Move to next word
            } else {
                strarr[index] += ch[i]; // Append character to the current word
            }
        }

        // Print all words
        for (String word : strarr) {
            System.out.println(word);
        }
    }
}
