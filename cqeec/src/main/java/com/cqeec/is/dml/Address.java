package com.cqeec.is.dml;

public class Address {
	private String id;
	private String country;
	private String city;

	@Override
	public String toString() {
		return "(" + country + " " + city + ")";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
