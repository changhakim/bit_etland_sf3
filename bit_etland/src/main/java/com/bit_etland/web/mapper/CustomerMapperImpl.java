package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;

@Repository
public class CustomerMapperImpl implements CustomerMapper{

	@Override
	public void insertCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerDTO> selectCustomerList(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> selectCustomers(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(CustomerDTO cus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String countCustomers(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO existCustomerID(CustomerDTO cus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> SelectProfile(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Object> selectPhone(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

}
