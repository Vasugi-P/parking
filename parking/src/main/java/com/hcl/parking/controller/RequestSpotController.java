package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.entity.RequestSpot;
import com.hcl.parking.service.RequestSpotService;

@RestController
@RequestMapping("/requests")
public class RequestSpotController {
	
	@Autowired
	RequestSpotService requestSpotService;
	
	@PostMapping("")
	public ResponseEntity<String> saveParkingSlot(@RequestBody RequestSpot requestSpot){
		return new ResponseEntity<String>(requestSpotService.request(requestSpot), new HttpHeaders(), HttpStatus.OK);
		 
	}

}
