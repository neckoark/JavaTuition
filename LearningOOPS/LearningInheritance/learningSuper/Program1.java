package LearningOOPS.LearningInheritance.learningSuper;

class Parent{
	int a,b;

	void height(){
		System.out.println(this.a+" "+this.b);
	}
}

class Child extends Parent{
	Child(){
		super.a = 10;
		super.b = 20;
	}

	void height(){
		super.height();
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.height();
	}
}