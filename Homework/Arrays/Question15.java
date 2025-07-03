package Homework.Arrays;

public class Question15 {
	public static void main(String[] args) {

		int[] arr = { 26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				arr[i] = 1;

		}
		printArray(arr);

	}

	static void printArray(int[] data) {
		for (int i : data)
			System.out.print(i + " ");
		System.out.println();
	}
}
