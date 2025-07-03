package multithreadinggg;

public class Test extends Thread {

	public void run(){
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.setName("First Thread");
		t.start();


		Test t2 = new Test();
		t2.setName("Second Thread");
		t2.start();


	}
}
