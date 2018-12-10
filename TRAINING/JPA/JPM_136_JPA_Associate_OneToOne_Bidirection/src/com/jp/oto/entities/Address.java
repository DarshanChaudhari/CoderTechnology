package com.jp.oto.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_OTO_BI")
public class Address {
	
	/*
	@Id
	@Column(name="emp_Id", unique=true, nullable=false)
	@GeneratedValue(generator="gen")@GenericGenerator(name="gen",
	strategy="foreign")*/
	
	@Id
	@Column(name="ADDRESS_ID")
	private Long addressId;
	
	@Column(name="ADDRESS_STREET")
	private String street;
	
	@Column(name="ADDRESS_CITY")
	private String city;
	
	@Column(name="ADDRESS_STATE")
	private String state;
	
	@Column(name="ADDRESS_ZIPCODE")
	private String zipCode;
	
	@OneToOne(cascade=CascadeType.ALL)
//	@PrimaryKeyJoinColumn
	@JoinColumn(name="EMP_ID")
	private Employee employee;
	
	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", employee=" + employee + "]";
	}

	public Address() {
		super();
		
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	

	
	
}