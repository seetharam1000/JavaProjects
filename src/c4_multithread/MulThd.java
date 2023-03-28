package c4_multithread;

public class MulThd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstThread t = new FirstThread();
		SecondThread t1 = new SecondThread();
		t.start();
		t1.start();
		
		//Anonymous class
		Thread t11 = new Thread() {
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
		t11.start();
	}

}
