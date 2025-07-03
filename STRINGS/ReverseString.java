package STRINGS;

import Extra.One;

public class ReverseString {
    public static void main(String[] args) {

        String s = "kedar";

		String rev = One.reverseString(s);
		System.out.println(rev);




		assert One.reverseString("hello").equals("olleh") : "Reverse failed!";

	}
}
