package a6_super_variable;

public class SubClass extends SuperClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass s = new SubClass();
		s.mtdsuper();
		
		
	}

	private void mtdsuper() {
		// TODO Auto-generated method stub
		System.out.println(super.superVariable);
	}
	
	

}
