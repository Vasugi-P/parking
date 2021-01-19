package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.AvailableSpot;

@Repository
public interface AvailableSpotRepository extends JpaRepository<AvailableSpot, Integer>{
	
	

}
