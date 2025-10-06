package com.flmfoods.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

	private long orderItemId;
	
	private Item item;
	
	private int quantity;
	
	private Order order;
	
}
