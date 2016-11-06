package com.javainstance;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 * @author javainstance
 *
 */
public class Writer {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Department.class);

			Marshaller marshaller = context.createMarshaller();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			Employee e1 = new Employee(1, "Abhay", 12);
			Employee e2 = new Employee(2, "Pawan", 32);
			Employee e3 = new Employee(3, "Jai", 18);
			Employee e4 = new Employee(4, "Rajan", 21);

			List<Employee> elist1 = new ArrayList<>();
			elist1.add(e1);
			elist1.add(e2);
			elist1.add(e3);
			elist1.add(e4);

			Department dept = new Department(1, "HR", elist1);

			marshaller.marshal(dept, new FileOutputStream("department.xml"));
			System.out.println("XML Generated");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}
}
