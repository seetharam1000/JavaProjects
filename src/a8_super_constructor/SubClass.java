package a8_super_constructor;

public class SubClass extends SuperClass{

	SubClass(String a, String b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass("Hello", "World");
		System.out.println(s.a+" "+s.b);
				
	}

}
