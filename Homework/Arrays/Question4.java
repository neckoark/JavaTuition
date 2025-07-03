package Homework.Arrays;
// Print maximum in columns
public class Question4 {
    public static void main(String[] args) {
        int[][] arr = {{22,31,9},{12,5,16},{34,42,2}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}
