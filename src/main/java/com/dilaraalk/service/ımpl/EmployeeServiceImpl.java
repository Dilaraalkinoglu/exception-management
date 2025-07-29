package com.dilaraalk.service.ımpl;

import java.util.Optional;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilaraalk.dto.DtoDepartment;
import com.dilaraalk.dto.DtoEmployee;
import com.dilaraalk.exception.BaseException;
import com.dilaraalk.exception.ErrorMessage;
import com.dilaraalk.exception.MessageType;
import com.dilaraalk.model.Department;
import com.dilaraalk.model.Employee;
import com.dilaraalk.repository.EmployeeRepository;
import com.dilaraalk.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString())); 
		}
		
		Employee employee = optional.get();
		Department department = employee.getDepartment();
		BeanUtils.copyProperties(employee, dtoEmployee);
		BeanUtils.copyProperties(department, dtoDepartment);
		
		dtoEmployee.setDepartment(dtoDepartment);
		
		
		return dtoEmployee;
	}
	

}
