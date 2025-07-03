package LearningOOPS.LearningAbstraction;

abstract class A{
	abstract void show();
	abstract void show(String s);
}
class B extends A{
	void show(){
		System.out.println("B Class");
	}
	void show(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		B b = new B();
		b.show();
		b.show("B Class with parameters");
	}
}
