package com.bit_etland.web.domain;

import lombok.Data;

@Data
public class CustomerDTO {
	private String no,
				   customerID,
				   customerName,
				   password,
				   ssn,
				   photo,
				   phone,
				   city,
				   address,
				   postalCode,
				   gender;

	
}
