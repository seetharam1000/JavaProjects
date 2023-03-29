package c6_threads;

public class FirstThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("First  ==>  "+i);
		}
	};
}
