package com.flmfoods.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="delivery_assignments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryAssignment {

	private long deliveryAssignmentId;
	
	private Order order;
	
	private DeliveryPartner deliveryPartner;
	
	private String status;
	
	private LocalDateTime assignedTime;
}
