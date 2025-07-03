package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

class Test1{
	void printTest1(){
		System.out.println("Test1");
	}
}
class Test2 extends Test1{
	void printTest2(){
		System.out.println("Test2");
	}
}
class Test3 extends Test2{
	void printTest3(){
		System.out.println("Test3");
	}

	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.printTest3();
		obj.printTest2();
		obj.printTest1();
	}
}
