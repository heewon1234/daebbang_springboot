package com.kdt.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Real_Estate_Agent")
public class RealEstateAgent {
	@Id
	@Column(name="email")
	private String email;
	
	@Column(name="pw")
	private String pw;
	
	@Column(name="estate_name")
	private String estateName;
	
	@Column(name="estate_number")
	private String estateNumber;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="manners_temperature")
	private double manners_temperature;
	
	@Column(name = "latitude")
	private double latitude;

	@Column(name = "longitude")
	private double longitude;
	
	@Column(name="role")
	private String role;
	
	@Column(name="enabled")
	private boolean enabled;

	
	public RealEstateAgent(String email, String pw, String estateName, String estateNumber, String name,
			String address, String phone, double manners_temperature, double latitude, double longitude, String role,
			boolean enabled) {
		super();
		this.email = email;
		this.pw = pw;
		this.estateName = estateName;
		this.estateNumber = estateNumber;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.manners_temperature = manners_temperature;
		this.latitude = latitude;
		this.longitude = longitude;
		this.role = role;
		this.enabled = enabled;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getEstateName() {
		return estateName;
	}


	public void setEstateName(String estateName) {
		this.estateName = estateName;
	}


	public String getEstateNumber() {
		return estateNumber;
	}


	public void setEstateNumber(String estateNumber) {
		this.estateNumber = estateNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public double getManners_temperature() {
		return manners_temperature;
	}


	public void setManners_temperature(double manners_temperature) {
		this.manners_temperature = manners_temperature;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public RealEstateAgent() {
		super();
	}
	
	
}