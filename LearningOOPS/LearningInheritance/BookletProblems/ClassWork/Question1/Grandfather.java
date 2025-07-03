package LearningOOPS.LearningInheritance.BookletProblems.ClassWork.Question1;

public class Grandfather {
	void grandfather() {
		System.out.println("Grandfather");
	}
}

class Father extends Grandfather {
	void father() {
		System.out.println("Father");
	}

	public static void main(String[] args) {
		Father f = new Father();
		f.father();
		f.grandfather();
	}
}
