package c3_hashset;

public class Employee {

	int jobId;
	String designation;
	double salary;

	public Employee(int jobId, String designation, double salary) {

		this.jobId = jobId;
		this.designation = designation;
		this.salary = salary;

	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
