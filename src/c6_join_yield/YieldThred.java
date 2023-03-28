package c6_join_yield;

import c4_multithread.FirstThread;
import c4_multithread.SecondThread;

public class YieldThred {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FirstThread t = new FirstThread();
		SecondThread t1 = new SecondThread();
		t.start();
		Thread.yield();
		t1.start();
		
		
	}
}
