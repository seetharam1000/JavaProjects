package a1_constructor;

public class Constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpConst emp = new EmpConst(1, "Vinay", 80000.00);
		System.out.println("Employee ID ==> "+emp.id);
		System.out.println("Employee Name ==> "+emp.name);
		System.out.println("Employee Salary ==> "+emp.salary);
		
		
		System.out.println("Employee Object ==>  "+emp);

	}

}
