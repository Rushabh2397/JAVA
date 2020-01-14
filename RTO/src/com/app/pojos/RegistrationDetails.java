package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ApplicantDetails")
public class RegistrationDetails {
	private Integer aadharCard;
	private String name,lastName,email,password,bloodGroup,
	guardianName,guardianMobNo,relation;
	private Role role;
	
	public RegistrationDetails() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationDetails(Integer aadharCard, String name, String lastName, String email, String password,
			String bloodGroup, Role role) {
		super();
		this.aadharCard = aadharCard;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.bloodGroup = bloodGroup;
		this.role = role;
	}

	public Integer getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(Integer aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianMobNo() {
		return guardianMobNo;
	}

	public void setGuardianMobNo(String guardianMobNo) {
		this.guardianMobNo = guardianMobNo;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
	 
	
	
	
	

}
