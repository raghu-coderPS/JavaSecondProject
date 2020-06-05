package com.SimpleExample;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.Employee.AddEmployee;
import com.Employee.EmployeePOJO;

@RunWith(JUnitPlatform.class)
class EmployeeTest {

	EmployeePOJO emp;
	AddEmployee addemp;
	
	@BeforeEach
	public void setup() {
		emp = new EmployeePOJO("bang","raghu",1);
		addemp = new AddEmployee(emp);
	}

	@Test
	public void testaddEmployeeMethod() {
		
		
		List<EmployeePOJO> employees = addemp.addEmployee();
		
		Assertions.assertNotNull(employees);
		Assertions.assertEquals(1, employees.size());
		
	}

	@Test
	void testgetEmployeeIdMethod() {
		
		addemp.addEmployee();
		EmployeePOJO emp1 = addemp.getEmployee(1);
		System.out.println(emp1);
		Assertions.assertNotNull(emp1);
		
	}
}
