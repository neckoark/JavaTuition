interface A{
	void add();
	void add(String s);
}

interface B extends A{
	void sub();
}

abstract class C {
	abstract void mul();
}

abstract class D extends C {
	abstract void div();
}

class E extends D implements B {
	public void add() {
		System.out.println("Add");
	}

	public void add(String s) {
		System.out.println("Add " + s);
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
		e.add("Random");
		e.sub();
		e.mul();
		e.div();
	}
}