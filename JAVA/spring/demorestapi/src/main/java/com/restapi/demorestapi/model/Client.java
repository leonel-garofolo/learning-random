package com.restapi.demorestapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Client {
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	@Column(name = "firstName", nullable = false)
	private String firstName;
	@Column(name = "lastName", nullable = false)
	private String lastName;
	@Column(name = "address", nullable = false)
	private String address;
	@Column(name = "phone", nullable = false)
	private String phone;
}
