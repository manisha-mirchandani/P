import java.awt.DisplayMode;

public class SynDemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);

	}
private Object dummy =new Object();


	private void display(String name) {
		System.out.println("Thread Entered");
		synchronized (dummy) {
			try {
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.print("]");

			} catch (InterruptedException e) {
			}
		}
		System.out.println("Thread Exited");
	}

	public static void main(String[] args) {
		SynDemo sd = new SynDemo();
		Thread t1 = new Thread(sd, "alpha");
		Thread t2 = new Thread(sd, "blpha");
		Thread t3 = new Thread(sd, "aclpha");

		t1.start();
		t2.start();
		t3.start();
	}
}
