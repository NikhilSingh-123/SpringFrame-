package com.entity;

public class Student {

	int id;
	String name;
	String course;
	String city;
	String email;
	long mobile;

	public Student() {

	}

	public Student(int id, String name, String course, String city, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.city = city;
		this.email = email;
		this.mobile = mobile;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", city=" + city + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}

}