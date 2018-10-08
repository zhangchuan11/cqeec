package com.cqeec.is.dml;

public class Student {
	private String id;
	private String number;
	private String name;
	private Address address;

	public String toString() {
		return "id：" + this.id + "\tnumber：" + this.number + "\tname：" + this.name + "\taddress：" + this.address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
