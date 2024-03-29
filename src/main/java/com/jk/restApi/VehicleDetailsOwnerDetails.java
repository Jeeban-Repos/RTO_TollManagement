package com.jk.restApi;

import com.jk.entity.VehicleDetlsEntity;
import com.jk.entity.VehicleOwnerAdderssDetlsEnitity;
import com.jk.entity.VehicleOwnerDetlsEntity;
import com.jk.entity.VehicleRegdDetlsEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

//Configure all dto classes
public class VehicleDetailsOwnerDetails {
	
	private VehicleDetlsEntity vhclDtlsEntity;
	private VehicleOwnerAdderssDetlsEnitity vhclOnrAddrDtlsEntity;
	private VehicleOwnerDetlsEntity vhclOnrDtlsEntity;
	private VehicleRegdDetlsEntity vhclRegdDtlsEntity;
	
}
