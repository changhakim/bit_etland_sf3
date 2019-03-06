package com.bit_etland.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component
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
