package STRINGS;

public class anagram {
    public static void main(String[] args) {

        String s = "kedar";
        String s1 = "radek";

        char[] arr = s.toCharArray();
        char[] arr1 = s1.toCharArray();

        bubblesort(arr);
        bubblesort(arr1);

        if(arr.length != arr1.length) System.out.println("No anagram");
        else{
            int counter = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == arr1[i]){
                    counter++;
                }
            }
            if(counter == arr.length){
                System.out.println("Anagram");
            } else System.out.println("Not anagram");
        }

    }

    public static void swap(char[] data, int first, int second) {
        char temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public static void bubblesort(char[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    swap(data, i, j);
                }
            }
        }
    }

}
