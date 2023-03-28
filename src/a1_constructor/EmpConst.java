package a1_constructor;

public class EmpConst {

	int id;
	String name;
	double salary;

	public EmpConst(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpConst [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
