package LearningOOPS.LearningInheritance.Day1;

class Test{
	void add(){
		System.out.println("Add in parent class");
	}
}

class Demo extends Test{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.add();
	}

	void add(){
		System.out.println("Add in child classs");
	}
}