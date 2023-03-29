package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name = "Employee_Data")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "Employee_Firstname")
	private String firstname;

	@Column(name = "Employee_LastName")
	private String lastname;

	@Column(name = "Employee_Department")
	private String department;

	@Column(name = "Employee_Phno")
	private String Phno;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastname, String department, String phno) {
		super();

		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		Phno = phno;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}

	@Override
	public String toString() {
		return "Employee [ firstname=" + firstname + ", lastname=" + lastname + ", department="
				+ department + ", Phno=" + Phno + "]";
	}

}
