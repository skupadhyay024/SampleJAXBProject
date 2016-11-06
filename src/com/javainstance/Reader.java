package com.javainstance;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author javainstance
 *
 */
public class Reader {

	public static void main(String[] args) {

		try {

			File xmlFile = new File("department.xml");
			JAXBContext context = JAXBContext.newInstance(Department.class);

			Unmarshaller unmarshaller = context.createUnmarshaller();
			Department dept = (Department) unmarshaller.unmarshal(xmlFile);

			System.out.println(
					"Department Id:" + dept.getDepartmentId() + " " + "Department Name:" + dept.getDepartmentName());
			System.out.println();
			System.out.println("Employees Details in Department:" + dept.getDepartmentName());
			System.out.println();
			List<Employee> employeeList = dept.getEmployees();
			employeeList.forEach((Employee) -> {
				System.out.println("Employee Id: " + Employee.getEmployeeId() + " " + "Employee Name: "
						+ Employee.getEmployeeName() + " " + "Employee Age: " + Employee.getEmployeedAge());
			}

			);
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}
