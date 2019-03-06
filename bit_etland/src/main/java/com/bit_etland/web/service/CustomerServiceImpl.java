package com.bit_etland.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public void registCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> bringCustomerList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> retrieveCustomers(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countCustomers(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existCustomerID(CustomerDTO cus) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> fileUpload(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> retrievePhone(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

}
