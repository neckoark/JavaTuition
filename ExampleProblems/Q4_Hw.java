package ExampleProblems;

// Smallest among 3 numbers
public class Q4_Hw {

	public static void main(String[] args) {
		int a = 10 , b = 7 , c = 1;

		System.out.println(smallest(a, b, c));
	}

	static int smallest(int a, int b, int c) {
		int sum = 0;
		while(a>0 & b>0 & c>0){
			a--;
			b--;
			c--;
			sum++;
		}
		return sum;
	}
}
