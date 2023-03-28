package c6_join_yield;

import c4_multithread.FirstThread;
import c4_multithread.SecondThread;

public class JoinThred {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirstThread t = new FirstThread();
		SecondThread t1 = new SecondThread();
		t.start();
		t.join();
		t1.start();
		
		
	}
}
