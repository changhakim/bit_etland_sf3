package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bit_etland.web.domain.OrderDetailDTO;

@Component
public interface OrderDetailMapper {

	public void insertOrderDetail(OrderDetailDTO orderDetail);
	
	public List<OrderDetailDTO> selectOrderDetailList();
	public List<OrderDetailDTO> selectOrderDetails(String searchWord);
	public OrderDetailDTO selectOrderDetail(String searchWord);
	public int countOrderDetails();
	public boolean existOrderDetails(String searchWord);
	
	public void updateOrderDetail(OrderDetailDTO orderDetail);
	public void deleteOrderDetail(OrderDetailDTO orderDetail);
}
