package a3_multlilevel_inheritance;

public class IntermediatParent extends Parent {
	
	double salary= 6000.00;
	int increamemt = 5000;
	
	public static void main(String args[]) {
		
		IntermediatParent intermediate = new IntermediatParent();
		
		System.out.println("Parent string as ==> "+intermediate.hello+" "+intermediate.world);
		
	}

}
