package c5_runnablethread;

public class RunnableThred implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Object
		RunnableThred rt = new RunnableThred();
		Thread t = new Thread(rt);
		
		//Using Anonymous class
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<10; i++) {
					System.out.println("welcome"+i);	
				}
			}
		};
		
		Thread ts = new Thread(r);
		t.start();
		ts.start();
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			System.out.println("hello"+i);	
		}
		
	}
	
	

}
