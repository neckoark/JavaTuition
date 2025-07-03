package Day14;

public class Test {
	public static void main(String[] args) {
		int a = 1;
		print(a);
	}

	static void print(int a) {
		if(a>10){
			System.exit(0);
		}
		System.out.println(a);
		print(a+1);
	}
}

