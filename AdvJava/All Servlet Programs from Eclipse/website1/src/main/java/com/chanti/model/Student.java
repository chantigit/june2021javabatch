package com.chanti.model;
public class Student {
	private String fullName;
	private String userId;
	private String password;
	private String courses;
	private String qulaification;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String fullName, String userId, String password, String courses, String qulaification) {
		super();
		this.fullName = fullName;
		this.userId = userId;
		this.password = password;
		this.courses = courses;
		this.qulaification = qulaification;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public String getQulaification() {
		return qulaification;
	}
	public void setQulaification(String qulaification) {
		this.qulaification = qulaification;
	}
	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", userId=" + userId + ", password=" + password + ", courses="
				+ courses + ", qulaification=" + qulaification + "]";
	}
	
}
