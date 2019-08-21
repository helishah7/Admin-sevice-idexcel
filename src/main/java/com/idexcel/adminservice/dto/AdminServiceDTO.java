package com.idexcel.adminservice.dto;

import javax.validation.constraints.NotNull;

import com.idexcel.adminservice.entity.Address;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminServiceDTO {
	
	@NotNull
	private String name;
	
	@NotNull
	private Address address;
	
	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	
	

}