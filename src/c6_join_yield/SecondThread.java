package c6_join_yield;

public class SecondThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Second  ==>  " + i);
		}
	};
}
