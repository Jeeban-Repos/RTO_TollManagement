package com.jk.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VehicleDetlsCmd {
	
	private String vtype;
	private Integer mfgYear;
	private String brandName;	//vehicle company name
	
}
