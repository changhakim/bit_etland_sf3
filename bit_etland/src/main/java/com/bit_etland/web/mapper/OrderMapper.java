package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDTO;

@Component
public interface OrderMapper {


	public void insertOrders(OrderDTO order);
	
	public List<OrderDTO> selectOrderList();
	public List<OrderDTO> selectOrders(String searchWord);
	public OrderDTO selectOrder(String searchWord);
	public int selectOrders();
	public String existOrders(String searchWord);
	
	public void updateOrder(OrderDTO order);
	public void deleteOrder(OrderDTO order);
}
