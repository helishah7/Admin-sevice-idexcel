package com.idexcel.adminservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="lenders")
public class lenders {
	
	@Id
	private String _id;
	
	private String name;
	
	private Address address;
	
	private String status;
	
	private String createdBy;
	
	private String createdDate;
	
	private String updatedBy;
	
	private String updatedDate;
	
	
	public lenders() {
		super();
	}

	public lenders(String name, Address address, String status, String createdBy, String createdDate, String updatedBy,
			String updatedDate) {
		super();
		this.name = name;
		this.address = address;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	}

	


