package com.auth.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user-auth")
public class UserLogin {

	private String uname;
	private String password;

	public UserLogin() {
	}

	public String getName() {
		return uname;
	}

	public UserLogin(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public void setName(String name) {
		this.uname = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLogin [uname=" + uname + ", password=" + password + "]";
	}

}
