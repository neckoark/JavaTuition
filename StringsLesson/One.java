package StringsLesson;

public class One {

	public static void concatenate(String s) {
		s = s + "program";
	}

	public static void concatenateSB(StringBuilder builder) {
		builder.append("program");
	}


	public static void main(String[] args) {

		String s = "Java";
		StringBuilder builder = new StringBuilder("Java");

		System.out.println(s);
		concatenateSB(builder);
		System.out.println(builder);


	}
}
