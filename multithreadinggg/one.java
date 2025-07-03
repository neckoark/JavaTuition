package multithreadinggg;

public class one {
	public static void main(String[] args) {
		System.out.println("thread");
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
}
