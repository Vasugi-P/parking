package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.service.ParkingSpotService;

@RestController
@RequestMapping("/parkingSpot")
public class ParkingSpotController {
	
	@Autowired
	ParkingSpotService parkingSpotService;
	
	@PostMapping("")
	public ResponseEntity<String> saveParkingSlot(@RequestParam Integer employeeId){
		return new ResponseEntity<String>(parkingSpotService.saveParkingSpot(employeeId), new HttpHeaders(), HttpStatus.OK);
		 
	}

}
