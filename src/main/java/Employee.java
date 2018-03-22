package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class Employee {
	
	/**
	 * 
	 */
	@Id private String id;

	/**
	 * 
	 */
	private String firstName;
	
	/**
	 * 
	 */
	private String lastName;
	
	/**
	 * 
	 */
	private int salary;
	
	/**
	 * 
	 */
	private Date hiredate;

	
	/**
	 * 
	 */
	public Employee() {
		
	}
	
	/**
	 * 
	 * @param name
	 * @param salary
	 * @param ssn
	 */
	public Employee(String firstName, String lastName, int salary, Date hiredate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	
	public String getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * 
	 * @param firstName
	 */
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * 
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Date getHiredate() {
		return hiredate;
	}
	
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public void setHiredate(String hiredate) {
		try {
			this.hiredate = new SimpleDateFormat("yyyy-MM-dd").parse(hiredate);
		} catch (Exception e) {
			// Do nothing
		}
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Employee " + id + " " + lastName + ", " 
				+ firstName + ": Hired " + hiredate.toString();
	}
}
