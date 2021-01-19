package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.parking.entity.ParkingSpot;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Integer> {
	
  ParkingSpot findBySpotId(Integer spotId);	
  ParkingSpot findByEmployeeId(Integer employeeId);

}
