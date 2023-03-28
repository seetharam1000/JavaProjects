package c3_hashset;

import java.util.*;

public class ListPojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Employee> employee = new LinkedList<Employee>();
		employee.add(new Employee(12, "Developer", 100000.0));
		employee.add(new Employee(25, "Tester", 750000.0));
		employee.add(new Employee(3, "Delivery Manager", 800000.0));

		for (Employee emp : employee) {
			System.out.println(emp.getJobId() + " - " + emp.getDesignation() + " - " + emp.getSalary());
		}
	}

}
