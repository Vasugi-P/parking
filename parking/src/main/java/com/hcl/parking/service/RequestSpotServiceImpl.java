package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.RequestSpot;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.RequestSpotRepository;

@Service
public class RequestSpotServiceImpl implements RequestSpotService{
	
	@Autowired
	RequestSpotRepository requestSpotRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String request(RequestSpot requestSpot) {
		Employee employee = employeeRepository.findEmployeeByEmployeeId(requestSpot.getRequestEmployeeId());
		if(requestSpot.getRequestEmployeeId()== employee.getEmployeeId() && employee.getExperience()<15) {
		requestSpotRepository.save(requestSpot);
		return "Saved";
	}
		return "Not Saved";
	}
}
