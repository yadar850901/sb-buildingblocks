package com.ry.rest.services.hello;

public class UserDetails {

	private String fstName;
	
	private String lstName;
	
	private String city;

	public String getFstName() {
		return fstName;
	}

	public void setFstName(String fstName) {
		this.fstName = fstName;
	}

	public String getLstName() {
		return lstName;
	}

	public void setLstName(String lstName) {
		this.lstName = lstName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public UserDetails(String fstName, String lstName, String city) {
		super();
		this.fstName = fstName;
		this.lstName = lstName;
		this.city = city;
	}
}
