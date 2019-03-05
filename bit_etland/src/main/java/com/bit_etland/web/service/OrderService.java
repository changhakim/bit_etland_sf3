package com.bit_etland.web.service;

import java.util.List;

import com.bit_etland.web.domain.OrderDTO;

public interface OrderService {
	
	public void registOrders(OrderDTO order);
	
	public List<OrderDTO> bringOrderList();
	public List<OrderDTO> retrieveOrders(String searchWord);
	public OrderDTO retrieveOrder(String searchWord);
	public int countOrders();
	public boolean existOrders(String searchWord);
	
	public void modifyOrder(OrderDTO order);
	public void removeOrder(OrderDTO order);
}
