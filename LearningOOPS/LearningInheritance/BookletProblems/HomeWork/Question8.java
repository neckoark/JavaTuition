package LearningOOPS.LearningInheritance.BookletProblems.HomeWork;

//  WAP to check whether you can inherit static variable of Parent class in Child class

class Parent{
	static String name = "Parent";

}

class Child extends Parent{
	public static void main(String[] args) {
		//Child child = new Child();
		System.out.println(name);
	}
}
