package a0_encapsulation;


public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Vinoth");
		emp.setSalary(75000.00);

		System.out.println("Employee ID ==> " +emp.getId());
		System.out.println("Employee ID ==> " +emp.getName());
		System.out.println("Employee ID ==> " +emp.getSalary());
		
		System.out.println("Employee object is "+emp);
	}

}
