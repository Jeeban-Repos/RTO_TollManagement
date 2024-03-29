package com.jk.entity;

import java.sql.Date;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="VEHICLE_OWNER_DETLS")
@ToString
public class VehicleOwnerDetlsEntity implements Serializable{
	private static final long serialVersionUID = 395682116861421475L;
	
	
	@Id
	@Column(name="VEHICLE_OWNER_ID")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "VEHICLE_OWNER_ID_SEQ")
	private int pid;
	@Column(name="FIRST_NAME", nullable = false)
	private String first_name;
	@Column(name="LAST_NAME", nullable = false)
	private String last_name;
	@Column(name="GENDER", nullable = false)
	private String gender;
	@Column(name="GMAIL", nullable = false)
	private String email;
	@Column(name="PHNO" , nullable = false, unique = true )
	private long  phno;
	@Column(name="DOB", nullable = false)
	private Date dob; 
	@Column(name="SSN", nullable = false, unique = true)
	private long ssn;	//adhar no
	
	@Column(name="CREATE_DT",updatable=false)
	@CreationTimestamp
	private Timestamp createdDate;
	@Column(name = "UPDATE_DT")
	@UpdateTimestamp
	private Timestamp updateDate;
	
}//class
