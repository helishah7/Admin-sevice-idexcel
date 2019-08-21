package com.idexcel.adminservice.service;

import java.util.List;

import com.idexcel.adminservice.dto.AdminServiceDTO;
import com.idexcel.adminservice.dto.LendersPatchDTO;
import com.idexcel.adminservice.entity.lenders;

public interface ServiceInterface {
	
	List<lenders> findAll();
	
	String saveLender(AdminServiceDTO theAdminDto);
	
	lenders getById(String _id);
	
	void updateById(lenders theLenders, String _id);
	
	void deleteById(String _id);

	void updateStatus(LendersPatchDTO theLendersPatchDto, String _id);

}
