package com.javainstance;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author javainstance
 *
 */
@XmlRootElement(name = "Department")
@XmlType(propOrder = { "departmentId", "departmentName", "employees" })
public class Department {

	private int departmentId;

	private String departmentName;

	private List<Employee> employees;

	public Department() {

	}

	public Department(int departmentId, String departmentName, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
	}

	@XmlElement(name = "Department_Id")
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@XmlElement(name = "Department_Name")
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@XmlElementWrapper(name = "Employees")
	@XmlElement(name = "Employee")
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
