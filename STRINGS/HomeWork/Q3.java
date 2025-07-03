package STRINGS.HomeWork;

//3) Write a Java program to count occurrences of a character in given string.



public class Q3 {
	public static void main(String[] args) {

		String str = "Satara";

		char[] unique = new char[str.length()];

		unique[0]= ' ';

		char[] chars = str.toCharArray();


		for(int i = 0; i < chars.length; i++){

			int count = 0;
			for(int j = 0; j < unique.length; j++){
				if(unique[j] != chars[i]){
					count++;
				} else break;
			}
			if(count == unique.length){
				System.out.println(unique);
			}
		}
	}
}
