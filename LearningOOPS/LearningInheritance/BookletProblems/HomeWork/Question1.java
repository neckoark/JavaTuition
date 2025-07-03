package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

class A{
	void printA(){
		System.out.println("This is parent class");
	}
}

class B extends A{
	void printB(){
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		B b = new B();
		A a = new A();

		a.printA();

		b.printB();
		b.printA();
	}
}
