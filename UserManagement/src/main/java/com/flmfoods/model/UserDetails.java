package com.flmfoods.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetails {

	private long userId;
	
	private String userName;
	
	private String phoneNumber;
	
	private List<Address> address;
	
	private List<Order> orders;
	
	private String email;
	
	private String password;
	
}
