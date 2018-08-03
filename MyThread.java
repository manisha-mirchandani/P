
public class MyThread extends Thread {

	private int data;

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ": " + ++data);
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread("first");
		MyThread t2 = new MyThread("second");
		MyThread t3 = new MyThread("third");

		t1.start();
		t2.start();
		t3.start();
		
		String name = currentThread().getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ": " + c);
		
	}

}
