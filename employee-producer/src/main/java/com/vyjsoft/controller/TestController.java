package com.vyjsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vyjsoft.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {
		
		Employee emp = new Employee();
		emp.setDesignation("CEO");
		emp.setEmpID("emp00001");
		emp.setName("Jose Gomez");
		emp.setSalary(230000);
		
		return emp;
	}
	
}
