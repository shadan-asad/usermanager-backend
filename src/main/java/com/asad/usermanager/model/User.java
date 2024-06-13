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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String dob;
	private String gender;
	private String city;
	private String state;
	private String country;
	
//	public User() {
//		super();
//	}
//	
//	public User(String name, String email, Integer phone, String dob, String gender, String city,
//			String state, String country) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//		this.dob = dob;
//		this.gender = gender;
//		this.city = city;
//		this.state = state;
//		this.country = country;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public Integer getPhone() {
//		return phone;
//	}
//
//	public void setPhone(Integer phone) {
//		this.phone = phone;
//	}
//
//	public String getDob() {
//		return dob;
//	}
//
//	public void setDob(String dob) {
//		this.dob = dob;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob
//				+ ", gender=" + gender + ", city=" + city + ", state=" + state + ", country=" + country + "]";
//	}
//	
	
	
}
