package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.Employee;
import com.hcl.parking.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String saveEmployee(Employee employee) {
	    employeeRepository.save(employee);
		return "Registered Successfully";
	}
   
	
}
