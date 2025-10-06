package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	private long orderId;
	
	private User user;
	
	private Restaurant restaurant;
	
	private String status;
	
	private List<OrderItem> orderItems;
	
	private double orderPrice;
}
