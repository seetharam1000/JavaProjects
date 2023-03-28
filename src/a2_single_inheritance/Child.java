package a2_single_inheritance;

public class Child extends Parent{

	String subStr = "This is sub class";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		
		System.out.println(c.subStr);
		System.out.println("Welcome to "+c.hello+" "+c.world);
	}

}
