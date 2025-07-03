package ExampleProblems;

// Q2 . Print the strong number in the given array
// 122 , 145 , 23 , 50

public class Q2 {
	public static void main(String[] args) {

		int[] arr = {122 , 145 , 23 ,111};
		for(int i : arr) {
			if(isStrongNumber(i)) System.out.println(i);
		}

	}


	static boolean isStrongNumber(int num) {

		return num == sumOfFactorials(num);
	}

	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	static int sumOfFactorials(int n) {
		int sum = 0;
		while (n != 0) {

			int last = n % 10;

			sum += factorial(last);

			n /= 10;
		}
		return sum;
	}
}