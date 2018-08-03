
public class YieldThread {
	static class HelloThread extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("helo");
			yield();
		}}
	}

	static class WorldThread extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println("world");
			     yield();
		}}
		
	}

	public static void main(String[] args) {
		HelloThread hello = new HelloThread();
		WorldThread world = new WorldThread();
		hello.start();
		world.start();
	}
}
