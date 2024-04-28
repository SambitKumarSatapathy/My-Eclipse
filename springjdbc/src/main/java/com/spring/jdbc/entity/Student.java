package com.spring.jdbc.entity;

public class Student {
	private int Id;
	private String name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", city=" + city + "]";
	}
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
