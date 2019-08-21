package com.idexcel.adminservice.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

	
	@NoArgsConstructor
	@AllArgsConstructor
	@Getter
	public class LenderErrorResponse {
		
		public LenderErrorResponse(int value, String message2, long currentTimeMillis) {
			// TODO Auto-generated constructor stub
		}
		private int status;
		private String message;
		private long timeStamp;

}
