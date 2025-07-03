package LearningOOPS.LearningInheritance.BookletProblems.ClassWork.Question1;


interface A{
	void add();
}

interface B{
	void sub();
}

abstract class C implements A,B{
	abstract void mul();
}

abstract class D extends C {
	abstract void div();
}

class E extends D {
	public void add() {
		System.out.println("Add");
	}
	public void sub() {
		System.out.println("Sub");
	}
	void mul() {
		System.out.println("mul");
	}
	void div() {
		System.out.println("Div");
	}

	public static void main(String[] args) {
		E e = new E();
		e.add();
		e.sub();
		e.mul();
		e.div();
	}
}

