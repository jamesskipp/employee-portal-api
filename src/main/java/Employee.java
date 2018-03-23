package main.java;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;

/**
 * The Employee class represents a salaried employee 
 * belonging to some organization.
 * 
 * @author Jskipp
 */
public class Employee {
	
	/**
	 * The ObjectId of the mongodb persistent
	 * object representation.
	 * 
	 * @Type String
	 */
	@Id private String id;

	/**
	 * The first name of the employee
	 * 
	 * @Type String
	 */
	private String firstName;
	
	/**
	 * The last name of the employee
	 * 
	 * @Type String
	 */
	private String lastName;
	
	/**
	 * The salary of the employee
	 * 
	 * @Type int
	 */
	private int salary;
	
	/**
	 * the date the employee was hired
	 * 
	 * @Type Date
	 */
	private Date hireDate;

	
	/**
	 * Default no-arg Constructor 
	 */
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.salary = 0;
		this.hireDate = new Date(0);
	}
	
	/**
	 * Constructor
	 * 
	 * @param firstName String the first name of the employee
	 * @param lastName String the last name of the employee
	 * @param salary int the salary of the employee
	 * @param hireDate Date the date the employee was hired
	 */
	public Employee(String firstName, String lastName, int salary, Date hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	/**
	 * Getter for id
	 * 
	 * @return String id
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * Getter for firstName
	 * 
	 * @return String firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Setter for firstName
	 * 
	 * @param firstName String
	 */
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter for salary
	 * 
	 * @return int salary
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * Setter for salary
	 * 
	 * @param salary int
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Getter for lastName
	 * 
	 * @return String lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter for lastName
	 * 
	 * @param lastName String
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter for hireDate
	 * 
	 * @return Date hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	
	/**
	 * Setter for hireDate
	 * 
	 * @param hireDate Date
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	/**
	 * Overloaded Setter for hireDate with a String
	 * 
	 * @param hireDate String the hireDate in yyyy-MM-dd format
	 */
	public void setHireDate(String hireDate) {
		try {
			this.hireDate = new SimpleDateFormat("yyyy-MM-dd").parse(hireDate);
		} catch (Exception e) {
			// Do nothing
		}
	}
	
	/**
	 * Overridden toString method
	 * 
	 * @return String string representation of Employee
	 */
	@Override
	public String toString() {
		return "Employee " + this.id + " " + 
				"Name: " + this.lastName + ", " + this.firstName + ": " + 
				"Hired: " + hireDate.toString() + " " +
				"Salary: " + this.salary;
	}
	
	/**
	 * Override of the equals(Object) method inherited
	 * from the Object class
	 * 
	 * @param obj Object the object to compare
	 * @return boolean whether or not the objects have equality
	 */
	@Override
	public boolean equals(Object obj) {
		// Check for self compare
		if (obj == this) {
			return true;
		}
		
		// Check if obj is an instance of Employee
		if (!(obj instanceof Employee)) {
			return false;
		}
		
		// Cast for comparisons
		Employee emp = (Employee) obj;
		
		// Return field by field comparison
		return this.firstName == emp.firstName &&
				this.lastName == emp.lastName &&
				this.hireDate == emp.hireDate &&
				this.salary == emp.salary;
	}
	
	/**
	 * Override of the hashCode method inherited from the
	 * Object class. Uses Objects class and fields to generate
	 * a hash value.
	 * 
	 * @return int the hash
	 */
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, hireDate, salary);
	}
	
}
