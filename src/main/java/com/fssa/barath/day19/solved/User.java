package com.fssa.barath.day19.solved;

public class User {
	int id;
	String name;
	String password;
	String email;

//	 The set method will set the user datas.
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	 The get method returns the data that had  already been set.
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

}