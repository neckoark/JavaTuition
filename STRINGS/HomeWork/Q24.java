package STRINGS.HomeWork;

	//Write a program to sort numbers from String. Also output should be in String. E.g. if
	//number in String is “2713” output should be “1237”.

import java.util.Arrays;

public class Q24 {
	public static void main(String[] args) {

		String str = "43229381239810210247387410238740198723091872350987213059873019571092387091874901740917234082730498721309487210523651763012730182370987123058723057809128734091	561";

		//System.out.println((int)str.charAt(str.length()-1)-48);

		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = (int)str.charAt(i)-48;
		}

		bubblesort(arr);

		String sorted = "";
		for(int x : arr) sorted+=x;

		System.out.println(sorted);
	}

	public static void swap(int[] data, int first, int second) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;
	}

	public static void bubblesort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					swap(data, i, j);
				}
			}
		}
	}
}

