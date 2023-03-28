package e0_j8_foreach;

import java.util.*;
import java.util.stream.Collectors;

public class ListPojo {

	public static void main(String args[]) {

		List<Employee> lstEmp = new ArrayList<>();
		lstEmp.add(new Employee(1, "Vinoth", "C1"));
		lstEmp.add(new Employee(2, "Rahul", "C2"));
		lstEmp.add(new Employee(3, "Rahul", "C2"));
		lstEmp.add(new Employee(4, "Rahul", "C3"));
		lstEmp.add(new Employee(5, "Rahul", "C2"));
		lstEmp.add(new Employee(6, "Rahul", "C2"));

		lstEmp.forEach(System.out::println);

		lstEmp.forEach(i -> System.out.println(i));

		lstEmp.forEach(i -> {
			System.out.println("Id   ==>  " + i.getId());
			System.out.println("Name   ==>  " + i.getName());
			System.out.println("Grade   ==>  " + i.getGrade());
		});

		List<Employee> ls = lstEmp.stream().filter(i -> i.getGrade().equals("C2")).collect(Collectors.toList());
		System.out.println(ls);
		System.out.println(ls.size());

	}
}
