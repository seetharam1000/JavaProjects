package c1_arraylist;

import java.util.*;

public class ListPojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee(1, "Vinoth", 100000.0));
		employee.add(new Employee(2, "Rakesh", 750000.0));
		employee.add(new Employee(3, "Ranjith", 800000.0));

		for (Employee emp : employee) {
			System.out.println(emp.getId() + " - " + emp.getName() + " - " + emp.getSalary());
		}
	}

}
