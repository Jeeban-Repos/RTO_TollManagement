package com.jk.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="VEHICLE_REGD_DTLS")
public class VehicleRegdDetlsEntity implements Serializable{
	private static final long serialVersionUID = -2798121299129239356L;
	
	@Id
	@Column(name="VEHICLE_REGD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "VEHICLE_REGD_ID_SEQ")
	private int regdId;
	@Column(name="REGD_DATE")
	private Date regdDate;
	@Column(name="REG_CENTER", nullable = false)
	private String regCenter;
	@Column(name="CREATE_DT")
	@CreationTimestamp
	private Timestamp createdDate;
	@Column(name = "UPDATE_DT")
	@UpdateTimestamp
	private Timestamp updateDate;
	@Column(name="VEHICLE_REGD_NUM", updatable = false, nullable = false)
	private String vehiceRegdNum;
	
	@OneToOne(orphanRemoval = true)
	@Cascade(CascadeType.ALL)
	@JoinColumn(name = "OWNER_ID_FK")
	private VehicleOwnerDetlsEntity  owner;
}
