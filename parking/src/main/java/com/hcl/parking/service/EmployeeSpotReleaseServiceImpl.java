package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.EmployeeSpotRelease;
import com.hcl.parking.entity.ParkingSpot;
import com.hcl.parking.entity.RequestSpot;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.EmployeeSpotReleaseRepository;
import com.hcl.parking.repository.ParkingSpotRepository;
import com.hcl.parking.repository.RequestSpotRepository;

@Service
public class EmployeeSpotReleaseServiceImpl implements EmployeeSpotReleaseService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ParkingSpotRepository  parkingSpotRepository;
	
	@Autowired
	EmployeeSpotReleaseRepository employeeSpotRRepository;
	
	@Autowired
	RequestSpotRepository requestSpotRepository;

	@Override
	public String release(Integer employeeId,Integer spotId) {
		String result="";
		Employee employee = employeeRepository.findEmployeeByEmployeeId(employeeId);
		ParkingSpot parkingSpot = parkingSpotRepository.findByEmployeeId(employeeId);
		ParkingSpot parkingSpot2 = parkingSpotRepository.findBySpotId(spotId);
		Integer list = parkingSpot.getSpotId();
		EmployeeSpotRelease employeeSpotRelease = new EmployeeSpotRelease();
	if(parkingSpot.getEmployeeId() == employee.getEmployeeId()){
		employeeSpotRelease.setEmployeeId(employeeId);
		employeeSpotRelease.getEmployeeSpotId();
		employeeSpotRelease.setSpotId(spotId);
		employeeSpotRRepository.save(employeeSpotRelease);
		return result ="Released";
	}
		return result="Not Released";
	}

	
	}	
	


