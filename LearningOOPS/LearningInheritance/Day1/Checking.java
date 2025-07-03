package LearningOOPS.LearningInheritance.Day1;

public class Checking {
	public static void main(String[] args) {

		new Check().add();

		Hello.main(args);
		Bye.main(args);

	}
}

class Check{
	void add(){
		System.out.println("Add method");
	}
}

class Hello{
	public static void main(String[] args) {
		System.out.println("Hello method");
	}
}

class Bye{
	public static void main(String[] args) {
		System.out.println("Bye method");
	}
}
