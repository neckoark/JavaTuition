package LearningOOPS.LearningInheritance.BookletProblems.ClassWork.Question1;

public class Animal {
	void animal() {
		System.out.println("Animal");
	}
}

class cat extends Animal {
	void cat() {
		System.out.println("meoww");
	}

	public static void main(String[] args) {
		cat c = new cat();
		c.animal();
		c.cat();
	}
}
