package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.parking.service.EmployeeSpotReleaseService;

@RestController
@RequestMapping("/employeeSpot")
public class EmployeeSpotReleaseController {

	
	@Autowired
	EmployeeSpotReleaseService employeeSpotReleaseService;
	
	@PostMapping("")
	public ResponseEntity<String> saveEmployeeSpot(@RequestParam  Integer employeeId,@RequestParam Integer spotId) {
		return new ResponseEntity<String>(employeeSpotReleaseService.release(employeeId,spotId), new HttpHeaders(), HttpStatus.OK);
	}

}
