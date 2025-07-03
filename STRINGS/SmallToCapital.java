package STRINGS;

public class SmallToCapital {
	public static void main(String[] args) {

		String small = "kedar";
		char[] chararray = small.toCharArray();

		for (int i = 0; i < chararray.length; i++) {
			int count = 1;
			for (int j = 'a'; j <= 'z'; j++) {
				if (chararray[i] == j) {
					break;
				} else {
					count++;
				}
			}
			if(count %2 ==0) System.out.println(count);
		}
	}
}
