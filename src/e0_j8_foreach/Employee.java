package e0_j8_foreach;

/**
 * @author Bhavyashri
 *
 */
public class Employee {

	private int id;
	private String name;
	private String grade;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

}
