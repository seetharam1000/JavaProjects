package a4_hierarchical_inheritance;

public class Child_Two extends Parent {
	
	double salary= 6000.00;
	int increament = 5000;
	
	public static void main(String args[]) {
		
		Child_Two intermediate = new Child_Two();
		
		System.out.println("Parent string as ==> "+intermediate.salary+" "+intermediate.increament);
		System.out.println("Parent string as ==> "+intermediate.hello+" "+intermediate.world);
		
	}

}
