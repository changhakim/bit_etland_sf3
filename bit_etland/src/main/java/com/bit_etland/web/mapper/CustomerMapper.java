package com.bit_etland.web.mapper;

import java.util.List;
import java.util.Map;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.proxy.Proxy;

public interface CustomerMapper {
	public void insertCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> selectCustomerList(Proxy pxy);
	public List<CustomerDTO> selectCustomers(Proxy pxy);
	public CustomerDTO selectCustomer(CustomerDTO cus);
	public String countCustomers(Proxy pxy);
	public CustomerDTO existCustomerID(CustomerDTO cus);
	
	
	public void updateCustomer(CustomerDTO customer);
	public Map<String, Object> SelectProfile(Proxy pxy);
	public void deleteCustomer(CustomerDTO customer);

	public Map<String, Object> selectPhone(Proxy pxy);

}
