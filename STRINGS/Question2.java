package STRINGS;

public class Question2 {

    public static void main(String[] args) {

        String s = "apple banana apple orange banana apple";
        char[] charr = s.toCharArray();

        int numwords=0;
        for(char c : charr){
            if(c == ' ') numwords++;
        }
        numwords++;

        String[] words = new String[numwords];
        int[] counts = new int[numwords];

        // To avoid null pointer exception
        for (int i = 0; i < numwords; i++) {
            words[i] = "";
        }

        int k = 0;
        for (char c : charr) {
            if (c == ' ') {
                k++;
            } else {
                words[k] += c;
            }
        }

        int uniqueCount = 0;
        String[] uniqueWords = new String[numwords];
        int[] uniqueCounts = new int[numwords];

        for (int i = 0; i < numwords; i++) {
            boolean found = false;
            for(int j = 0; j < uniqueCount; j++){
                if(words[i].equals(uniqueWords[j])){
                    uniqueCounts[j]++;
                    found = true;
                    break;
                }

            }
            if(!found){
                uniqueWords[uniqueCount] = words[i];
                uniqueCounts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + ": " + uniqueCounts[i]);
        }

    }
}
