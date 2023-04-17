package groceryStore;

import java.util.Date;

public class Employee extends Person {

	private Double salary;
	private JobTitle jobTitle;
	
	public Employee(int socialSecurityNumber, String name, Date birthDate, Address address, String phoneNumber,
			String mail, Double salary, JobTitle jobTitle) {
		super(socialSecurityNumber, name, birthDate, address, phoneNumber, mail);
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public JobTitle getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}

}

