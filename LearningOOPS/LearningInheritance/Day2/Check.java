package LearningOOPS.LearningInheritance.Day2;

class A{
	void add(){
		System.out.println("Add");
	}
}

class B extends A{
	void add(int a){
		System.out.println("Add");
	}
}

class C extends B{
	void add(int a, int b){
		System.out.println("Add");
	}
}

class D extends C{
	void add(String s){
		System.out.println("Add");
	}
}

class E extends D{
	void add(String s, String t){
		System.out.println("Add");
	}
}

class G extends E{
	void add(String s, String t){
		System.out.println("Add");
	}
}
class F extends E{
	public static void main(String[] args) {
		F f = new F();
		f.add();
		f.add(0);
		f.add(1,1);
		f.add("kedar");
		f.add("one","two");
	}
}
