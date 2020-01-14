package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="user_addr")
public class Address 
{
	
	private String state,district,city,address;
	private int pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String district, String city, String address, int pincode) {
		
		this.state = state;
		this.district = district;
		this.city = city;
		this.address = address;
		this.pincode = pincode;
	}
    @Column(length = 20)
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
      @Column(length = 20)      
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Column(length=25) 
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
     
	@Column(length = 50)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    @Column(length = 6)
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	} 
	

}
