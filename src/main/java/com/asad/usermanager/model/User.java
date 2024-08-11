package com.asad.usermanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "userd")
public class User {

	@Id
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String dob;
	private String gender;
	private String city;
	private String state;
	private String country;

}
