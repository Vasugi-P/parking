package com.hcl.parking.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "request_spot")
public class RequestSpot {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestSlotId;
	private Integer requestEmployeeId;
	private Date fromDate;
	private Date toDate;
}
