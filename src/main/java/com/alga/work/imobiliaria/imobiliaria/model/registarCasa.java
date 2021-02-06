package com.alga.work.imobiliaria.imobiliaria.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="registarCasa")
public class registarCasa {

	@Id
	@Column(name = "homeID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long homeId;
	@Column(name = "homePlace", nullable=false)
	private String homePlace;
	@Column(name = "homeType", nullable=false)
	private String homeType;
	@Column(name = "bussiness", nullable=false)
	private String bussiness;
	@Column(name = "price", nullable=false)
	private String price;
	@Column(name = "goodFor", nullable=false)
	private String goodFor;
	@Column(name = "nmrBath", nullable=false)
	private String nmrBath;
	@Column(name="address", nullable=false, unique=true)
	private String address;
	
	public Long getHomeId() {
		return homeId;
	}
	public void setHomeId(Long homeId) {
		this.homeId = homeId;
	}
	public String getHomePlace() {
		return homePlace;
	}
	public void setHomePlace(String homePlace) {
		this.homePlace = homePlace;
	}
	public String getHomeType() {
		return homeType;
	}
	public void setHomeType(String homeType) {
		this.homeType = homeType;
	}
	public String getBussiness() {
		return bussiness;
	}
	public void setBussiness(String bussiness) {
		this.bussiness = bussiness;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGoodFor() {
		return goodFor;
	}
	public void setGoodFor(String goodFor) {
		this.goodFor = goodFor;
	}
	public String getNmrBath() {
		return nmrBath;
	}
	public void setNmrBath(String nmrBath) {
		this.nmrBath = nmrBath;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
