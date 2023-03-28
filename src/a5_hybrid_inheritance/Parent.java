package a5_hybrid_inheritance;

public class Parent extends GrandParent{
	
	String hello = "Hello";
	String world = "World";
	
	int age = 50;
	
	
	public static void main(String args[]) {
		
		Parent parent = new Parent();
		System.out.println("Grand parent property is "+parent.myProperty());
		System.out.println("Parent age is "+parent.age);
	}
	
}
