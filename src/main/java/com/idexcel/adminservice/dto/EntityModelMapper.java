package com.idexcel.adminservice.dto;

import org.modelmapper.ModelMapper;


import com.idexcel.adminservice.entity.lenders;

public class EntityModelMapper {
		
	
	
		ModelMapper modelMapper = new ModelMapper();
		
		public AdminServiceDTO convertToDTO (lenders lenders) {
			
			AdminServiceDTO adminServiceDTO = modelMapper.map(lenders, AdminServiceDTO.class);
			
			return adminServiceDTO;
			
		}
		
		public lenders converttoEntity (AdminServiceDTO theAdminDTO) {
			
			lenders theLenders = modelMapper.map(theAdminDTO, lenders.class);
			
			return theLenders;
		}
		
		
		
		
}