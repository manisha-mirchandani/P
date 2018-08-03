
public class MyRunnable implements Runnable {
	private int data;

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ": " + ++data);
	}

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "first");
		Thread t2 = new Thread(mr, "second");
		Thread t3 = new Thread(mr, "third");

		t1.start();
		t2.start();
		t3.start();
	}

}
