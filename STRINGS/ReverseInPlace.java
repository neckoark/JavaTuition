package STRINGS;

public class ReverseInPlace {
	public static void main(String[] args) {

	String str = " This is a java program";

//	String reverse = "";
	char[] chars = str.toCharArray();

//	String rev = "";
//	for(int i = 0 ; i < chars.length ; i++){
//
//		if(chars[i] != ' '){
//			rev = chars[i] + rev;
//		} else {
//			reverse = reverse + rev + " ";
//			rev = "";
//		}
//	}
//	reverse  += rev;
//	System.out.println(reverse);

	// Another approach
	int start = 0;

	for (int i = 0; i < chars.length; i++) {
		if(i == chars.length || chars[i] == ' '){
			reverse(chars, start, i-1);
			start = i+1;
		}
	}

		System.out.println(new String(chars));


//		String reversedStr = "";
//
//		String[] strarr = str.split(" ");
//		for (int i = 0; i < strarr.length; i++) {
//			StringBuilder sbr = new StringBuilder(strarr[i]);
//			sbr.reverse();
//			reversedStr = reversedStr +  sbr.toString() + " ";
//		}
//		System.out.println(reversedStr);


		// Using logic
//		char[] strarr2 = str.toCharArray();
//
//		int whitespacenum = 0;
//		for (int i = 0; i < strarr2.length; i++) {
//			if (strarr2[i] == ' ') {
//				whitespacenum++;
//			}
//		}
//
//		int[] whitespacenums = new int[whitespacenum+2];
//		whitespacenums[0] = 0;
//		whitespacenums[whitespacenum+1] = strarr2.length;
//		int k = 1;
//		for (int i = 0; i < strarr2.length; i++) {
//			if (strarr2[i] == ' ') {
//				whitespacenums[k] = i;
//				k++;
//			}
//		}
//
//		String reversedStr = "";
//		for(int i = 0 ; i < whitespacenums.length - 1 ; i++){
//			String rev = "";
//			for(int j = whitespacenums[i]; j < whitespacenums[i+1] ; j++){
//
//				rev = strarr2[j] + rev;
//
//			}
//			reversedStr = reversedStr + rev;
//		}
//		System.out.println(reversedStr);


	}

	public static void reverse(char[] chars, int i, int j){
		while(i < j){
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;
			j--;
		}
	}
}
