package com.idexcel.adminservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class LendersPatchDTO {
	
	public String get_id() {
		return _id;
	}
	public String getStatus() {
		return status;
	}
	private String _id;
	private String status;
	

}
