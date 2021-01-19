package com.hcl.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.parking.service.AvailableSpotService;

@RestController
@RequestMapping("/spots")
public class AvailableSpotController {
 
	@Autowired
	AvailableSpotService availableSpotService;
	
//	@PostMapping("")
//	public ResponseEntity<String> saveEmployee(@RequestBody AvailableSpot availableSpot) {
//		return new ResponseEntity<String>(availableSpotService.Available(availableSpot), new HttpHeaders(), HttpStatus.OK);
//	}
	
}
