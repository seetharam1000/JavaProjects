package a5_hybrid_inheritance;

public class Child_One extends Parent{

	String subStr = "This is sub class";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child_One c = new Child_One();
		
		System.out.println("Child class ==>  "+c.subStr);
		System.out.println("Parent string as ==>  "
					+c.hello+" "+c.world);
	}

}
