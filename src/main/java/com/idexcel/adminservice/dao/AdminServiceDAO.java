package com.idexcel.adminservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.idexcel.adminservice.entity.lenders;

@Repository
public interface AdminServiceDAO extends MongoRepository<lenders, String> {

	public lenders findByName (String name);
	

}
