package com.studentservice.studentmgt.dto;

public class StudentDto {

	private Integer id;
	private String name;
	private int age;
	private String address;
	private Long phoneNumber;

	public StudentDto() {
	}

	public StudentDto(Integer id,String name, int age, String address, Long phoneNumber) {
		this.id=id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
