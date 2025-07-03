package ExceptionHandling;

public class First {
	public static void main(String[] args) {
		String name = null;
		int age = 0;
		try{
			System.out.println(name.length());
		}

		catch (NullPointerException e) {
			System.out.println("NullPointer Exception");
		}
		try{
			System.out.println(age/0);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch (Exception e) {
			System.out.println("Arithmetic Exception");
		}

	}
}
