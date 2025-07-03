package LearningOOPS.LearningInheritance.MultipleInheritance;

public class A {
	void add(){
		System.out.println("A");
	}
}

class B extends A{
	void sub(){
		System.out.println("B");
	}
}

class C extends A{
	void print(){
		System.out.println("Satara");
	}
}

class D extends A{
	void print(){
		System.out.println("Pune");
	}
}

class E extends B{
	void div(){
		System.out.println("E");
	}
}

class F extends B{
	void mul(){
		System.out.println("F");
	}

	public static void main(String[] args) {
		E e = new E();
		e.div();
		e.sub();
		e.add();

		C c = new C();
		c.print();
		c.add();

		D d = new D();
		d.print();
		d.add();

		F f = new F();
		f.mul();
		f.sub();
		f.add();
	}
}

