package a7_super_method;

public class SubClass extends SuperClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass s = new SubClass();
		s.mtdsuper();
		
		
	}

	private void mtdsuper() {
		// TODO Auto-generated method stub
		super.superMethod("Hello world");
	}
	
	

}
