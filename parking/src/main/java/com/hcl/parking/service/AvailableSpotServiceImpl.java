package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.dto.Available;
import com.hcl.parking.entity.AvailableSpot;
import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.ParkingSpot;
import com.hcl.parking.entity.RequestSpot;
import com.hcl.parking.repository.AvailableSpotRepository;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkingSpotRepository;
import com.hcl.parking.repository.RequestSpotRepository;

@Service
public class AvailableSpotServiceImpl implements AvailableSpotService{
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	@Autowired
	RequestSpotRepository requestSpotRepository;
	
	@Autowired
	AvailableSpotRepository availableSpotRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

//	@Override
//	public String Available(AvailableSpot availableSpot) {
//		RequestSpot requestSpot = requestSpotRepository.findByRequestEmployeeId(availableSpot.getTempEmployeeId());
//		ParkingSpot parkingSpot =parkingSpotRepository.findByEmployeeId(availableSpot.getTempEmployeeId());
//		Employee employee = employeeRepository.findEmployeeByEmployeeId(availableSpot.getReleasedEmployeeId());
//		availableSpot.setTempEmployeeId(requestSpot.getRequestEmployeeId());
//		if(requestSpot.getFromDate() == availableSpot.getDate()) 
//		  availableSpot.setDate(requestSpot.getFromDate());
//		else if(requestSpot.getToDate() == availableSpot.getDate()) 
//			availableSpot.setDate(requestSpot.getToDate());
//		 else
//			availableSpot.getDate();
//		availableSpot.setSpotId(requestSpot.getRequestSlotId());
//		availableSpot.setReleasedEmployeeId(employee.getEmployeeId());
//		availableSpotRepository.save(availableSpot);
//		return "aved";
//	
//		}

	@Override
	public String AvailableSpot(Available available) {
		RequestSpot requestSpot = requestSpotRepository.findByRequestEmployeeId(available.getReleasedEmployeeId());
		Employee employee= employeeRepository.findEmployeeByEmployeeId(available.getReleasedEmployeeId());
		AvailableSpot availableSpot = new AvailableSpot();
		availableSpot.getAvailableSpotId();
		availableSpot.setSpotId(requestSpot.getRequestSlotId());
		availableSpot.setDate(requestSpot.getFromDate());
		availableSpot.setDate(requestSpot.getToDate());
		availableSpot.setTempEmployeeId(requestSpot.getRequestEmployeeId());
		availableSpotRepository.save(availableSpot);
		return "Saved";
	}


}
