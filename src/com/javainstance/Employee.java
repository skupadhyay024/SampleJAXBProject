package com.javainstance;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author javainstance
 *
 */
@XmlRootElement(name = "Employee")
public class Employee {

	private int employeeId;

	private String employeeName;

	private int employeedAge;

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, int employeedAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeedAge = employeedAge;
	}

	@XmlElement(name = "Employee_Id")
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@XmlElement(name = "Employee_Name")
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@XmlElement(name = "Employee_Age")
	public int getEmployeedAge() {
		return employeedAge;
	}

	public void setEmployeedAge(int employeedAge) {
		this.employeedAge = employeedAge;
	}

}
