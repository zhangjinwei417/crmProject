package com.bjsxt.pojo;
/**
 * @author:jwzhang
 * @date:2017年9月4日下午1:00:29
 */
public class User {

	private Integer id;
	private String name;
	private String password;
	private String gender;
	private Integer age;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", gender=" + gender + ", age=" + age + "]";
	}
	public User(Integer id, String name, String password, String gender,
			Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
	}
	public User() {
		super();
	}
	
}
