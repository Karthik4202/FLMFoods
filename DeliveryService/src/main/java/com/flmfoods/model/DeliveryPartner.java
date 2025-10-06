package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="delivery_partners")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartner {

	private long deliveryPartnerId;
	
	private String deliveryPartnerName;
	
	private String aadhar;
	
	private String phoneNumber;
	
	private boolean isAvailable;
	
	private List<DeliveryAssignment> deliveryAssignments;
	
}
