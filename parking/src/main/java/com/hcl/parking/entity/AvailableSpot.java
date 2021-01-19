package com.hcl.parking.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "available_spot")
public class AvailableSpot {
	
	@Id
	@GeneratedValue()
	private Integer availableSpotId;
	private Integer spotId;
	private Integer releasedEmployeeId;
	private Date date;
	private Integer tempEmployeeId;
	

}
