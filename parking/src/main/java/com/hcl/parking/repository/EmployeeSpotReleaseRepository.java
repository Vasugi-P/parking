package com.hcl.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.parking.entity.EmployeeSpotRelease;

@Repository
public interface EmployeeSpotReleaseRepository extends JpaRepository<EmployeeSpotRelease, Integer> {

	EmployeeSpotRelease findBySpotId(Integer spotId);
}
