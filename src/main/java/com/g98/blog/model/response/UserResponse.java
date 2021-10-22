package com.g98.blog.model.response;

public class UserResponse {
	private String email;
	private String username;
	
	
	public UserResponse(String email, String username) {
		super();
		this.email = email;
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
