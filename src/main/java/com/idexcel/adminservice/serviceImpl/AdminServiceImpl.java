package com.idexcel.adminservice.serviceImpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.idexcel.adminservice.dao.AdminServiceDAO;
import com.idexcel.adminservice.dto.AdminServiceDTO;
import com.idexcel.adminservice.dto.EntityModelMapper;
import com.idexcel.adminservice.dto.LendersPatchDTO;
import com.idexcel.adminservice.entity.lenders;
import com.idexcel.adminservice.exception.LenderAlreadyExistsException;
import com.idexcel.adminservice.exception.LenderNotFoundException;
import com.idexcel.adminservice.service.ServiceInterface;

@Service
public class AdminServiceImpl implements ServiceInterface {

	@Autowired
	private AdminServiceDAO theadminserviceDAO;
	
	@Autowired
	EntityModelMapper theModelMapper = new EntityModelMapper();

		
	@Override
	public List<lenders> findAll() {
		
		List<lenders> theLenders = this.theadminserviceDAO.findAll(Sort.by(Direction.DESC, "createdDate"));
		
		if (theLenders == null) {
			return Collections.emptyList();
		}	
		return theLenders;	
		
	}
	
	
	@Override
	public String saveLender(AdminServiceDTO theAdminDto) {
		
		String name = theAdminDto.getName();
		
		System.out.println(name);
		
		//if the lender with the name does not exist add user or return exception
		if (theadminserviceDAO.findByName(name)==null){		
			
		lenders theLenders = theModelMapper.converttoEntity(theAdminDto);
		theLenders.set_id("5768542");
		theLenders.setStatus("Active");
		theLenders.setCreatedBy("Praveen K");
		TimeZone tz = TimeZone.getTimeZone("UTC");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); 
		df.setTimeZone(tz);
		String nowAsISO = df.format(new Date());
		theLenders.setCreatedDate(nowAsISO);
		theLenders.setUpdatedBy("Praveen K");
		theLenders.setUpdatedDate(nowAsISO);
		
		theadminserviceDAO.insert(theLenders);
		
		return theLenders.get_id();
		
		}
		 else {
				throw new LenderAlreadyExistsException ("the lender with the name specified already Exist" + name);
			} 

	}
	
	
	@Override
	public lenders getById (String _id) {
	
		 return this.theadminserviceDAO.findById(_id).orElse(null);
	}


	public void updateById(lenders theLenders, String _id) {
		
		this.theadminserviceDAO.save(theLenders);
	}


	public void deleteById(String _id) {
		this.theadminserviceDAO.deleteById(_id);
		
	}
	
	public void updateStatus(LendersPatchDTO lendersPatchDto, String _id) {
		
		if (theadminserviceDAO.existsById(_id)) {
		lenders theLenders = this.theadminserviceDAO.findById(_id).orElse(null);
		
		theLenders.setStatus(lendersPatchDto.getStatus());	
		this.theadminserviceDAO.save(theLenders);
		}
		
		else
			throw new LenderNotFoundException ("The Lender with the Id:"+ _id +"does not exist");
			
	}
	
	public boolean checkLender(String _id) {
		if (theadminserviceDAO.existsById(_id)) {
			return true;
		}
		else
			throw new LenderNotFoundException ("The Lender with the Id:"+ _id +"dows not exist" );
		
}
	
}
	
	
	
	
	
	
	
	
	
	