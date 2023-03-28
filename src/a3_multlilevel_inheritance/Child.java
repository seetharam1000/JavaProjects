package a3_multlilevel_inheritance;

public class Child extends IntermediatParent{

	String subStr = "This is sub class";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		
		System.out.println("Child class ==>  "+c.subStr);
		System.out.println("Intermediate class salary ==>  "+c.salary +" and increament is "+c.increamemt);
		System.out.println("Parent string as ==>  "+c.hello+" "+c.world);
	}

}
