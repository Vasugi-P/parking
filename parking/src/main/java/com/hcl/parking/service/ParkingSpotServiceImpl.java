package com.hcl.parking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.parking.entity.Employee;
import com.hcl.parking.entity.ParkingSpot;
import com.hcl.parking.repository.EmployeeRepository;
import com.hcl.parking.repository.ParkingSpotRepository;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService{
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String saveParkingSpot(Integer employeeId) {
		Employee employee = employeeRepository.findEmployeeByEmployeeId(employeeId);
		if(employee.getExperience() >= 15) {
			ParkingSpot parkingSpot = new ParkingSpot();
			parkingSpot.setEmployeeId(employee.getEmployeeId());
			parkingSpot.setSpotName("Tower" +employeeId);
			parkingSpot.setSpotStatus("Available");
			parkingSpotRepository.save(parkingSpot);
			return "Occupied";
		}
		return "Not Occupied";
		
	}

}
