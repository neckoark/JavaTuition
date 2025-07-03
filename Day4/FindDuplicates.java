package Day4;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 7, 4, 8, 2, 9, 7 };

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
    }
}
