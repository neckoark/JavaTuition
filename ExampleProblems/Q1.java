package ExampleProblems;

// Write a program to create following number series
// 1,2, 5 , 8 , 13 , 18 , 25 , 32

public class Q1 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 7; i+=2) {
			sum = sum + i;
			System.out.println(sum);
			sum = sum + i;
			System.out.println(sum);
		}

	}
}

