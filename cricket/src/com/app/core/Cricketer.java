package com.app.core;

public class Cricketer {

	private String name;
	private int age;
	private String email;
	private String phone;
	private int rating;

//	started coding at 1:45 !!

	public Cricketer(String name, int age, String email, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email=" + email + ", phone=" + phone + ", rating="
				+ rating + "]";
	}

}
