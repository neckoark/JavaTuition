package Day20;

public class Test {
	public static void main(String[] args) {

		char[] arr = {'s','q','i','o','a','s','a','a'};

		char[] vowels = {'a','e','i','o','u'};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (arr[i] == vowels[j]) {
					System.out.print(arr[i] + " ");
					break;

				}
			}
		}
		System.out.println();

		int acount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'A') {
				acount++;
			}
		}
		System.out.println(acount);

	}

}
