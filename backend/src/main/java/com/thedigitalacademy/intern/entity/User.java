package com.thedigitalacademy.intern.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int id;
	
	@Column(name="Name")
	@NotNull
	private String name;
	
	@Column(name="Surname")
	@NotNull
	private String surname;
	
	@Column(name="IdNumber")
	@NotNull
	private String idNumber;
	
	@Column(name="IdType")
	@NotNull
	private String idType;
	
	@Column(name="Gender")
	@NotNull
	private char gender;
	
	@Column(name="Email")
	@NotNull
	private String email;
	
	@Column(name="ContactNumber")
	@NotNull
	private String contactNumber;
	
	@Column(name="ResidentialAddressLine1")
	@NotNull
	private String residentialAddressLine1;
	
	@Column(name="ResidentialAddressLine2")
	@NotNull
	private String residentialAddressLine2;
	
	@Column(name="ResidentialAddressLine3")
	@NotNull
	private String residentialAddressLine3;
	
	@Column(name="ResidentialAddressLinePostalCode")
	@NotNull
	private String residentialAddressLinePostalCode;
	
	@Column(name="ResidentialMunicipalDistrict")
	@NotNull
	private String residentialMunicipalDistrict;
	
	@Column(name="RameAsResidentialforPostal")
	@NotNull
	private String sameAsResidentialforPostal;

	
	//why super class
	public User() {
		super();
	}

// constructor 
	public User(int id, String name, String surname, String idNumber, String idType, char gender, String email,
			String contactNumber, String residentialAddressLine1, String residentialAddressLine2,
			String residentialAddressLine3, String residentialAddressLinePostalCode,
			String residentialMunicipalDistrict, String sameAsResidentialforPostal) {
		super();
		this.id =  id;
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
		this.idType = idType;
		this.gender = gender;
		this.email = email;
		this.contactNumber = contactNumber;
		this.residentialAddressLine1 = residentialAddressLine1;
		this.residentialAddressLine2 = residentialAddressLine2;
		this.residentialAddressLine3 = residentialAddressLine3;
		this.residentialAddressLinePostalCode = residentialAddressLinePostalCode;
		this.residentialMunicipalDistrict = residentialMunicipalDistrict;
		this.sameAsResidentialforPostal = sameAsResidentialforPostal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getResidentialAddressLine1() {
		return residentialAddressLine1;
	}

	public void setResidentialAddressLine1(String residentialAddressLine1) {
		this.residentialAddressLine1 = residentialAddressLine1;
	}

	public String getResidentialAddressLine2() {
		return residentialAddressLine2;
	}

	public void setResidentialAddressLine2(String residentialAddressLine2) {
		this.residentialAddressLine2 = residentialAddressLine2;
	}

	public String getResidentialAddressLine3() {
		return residentialAddressLine3;
	}

	public void setResidentialAddressLine3(String residentialAddressLine3) {
		this.residentialAddressLine3 = residentialAddressLine3;
	}

	public String getResidentialAddressLinePostalCode() {
		return residentialAddressLinePostalCode;
	}

	public void setResidentialAddressLinePostalCode(String residentialAddressLinePostalCode) {
		this.residentialAddressLinePostalCode = residentialAddressLinePostalCode;
	}

	public String getResidentialMunicipalDistrict() {
		return residentialMunicipalDistrict;
	}

	public void setResidentialMunicipalDistrict(String residentialMunicipalDistrict) {
		this.residentialMunicipalDistrict = residentialMunicipalDistrict;
	}

	public String getSameAsResidentialforPostal() {
		return sameAsResidentialforPostal;
	}

	public void setSameAsResidentialforPostal(String sameAsResidentialforPostal) {
		this.sameAsResidentialforPostal = sameAsResidentialforPostal;
	}
	
	
	

}
