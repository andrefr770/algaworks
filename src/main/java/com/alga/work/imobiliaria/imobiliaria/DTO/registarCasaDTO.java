package com.alga.work.imobiliaria.imobiliaria.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class registarCasaDTO {
	
	private Long homeId;
	private String homePlace;
	private String homeType;
	private String bussiness;
	private String price;
	private String goodFor;
	private String nmrBath;
	
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
}
