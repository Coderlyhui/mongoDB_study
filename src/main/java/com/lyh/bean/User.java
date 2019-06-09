package com.lyh.bean;

public class User {

	private Integer id;
	private String name;
	private Integer age;
	private String status;
	private boolean isDel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isDel() {
		return isDel;
	}
	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", status=" + status + ", isDel=" + isDel + "]";
	}
	
	
	
	
}
