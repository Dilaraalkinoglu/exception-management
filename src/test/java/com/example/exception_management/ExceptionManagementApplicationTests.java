package com.example.exception_management;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dilaraalk.dto.DtoEmployee;
import com.dilaraalk.service.IEmployeeService;
import com.dilaraalk.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach çalıştı...");
		
	}

	// ctrl + 1
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		
		if (employee!=null) {
			System.out.println("İsim : " + employee.getName());
		}
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach çalıştı...");
	}
}
