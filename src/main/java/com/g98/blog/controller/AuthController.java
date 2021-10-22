package com.g98.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g98.blog.model.request.UserDto;
import com.g98.blog.model.response.UserResponse;
import com.g98.blog.service.IUserService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private IUserService userService;
	
	
	@PostMapping( value = "/login")
	public ResponseEntity<?> loginUser() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@PostMapping( "/sign_up")
	public ResponseEntity<?> RegisterUser(@RequestBody UserDto user) {
		UserResponse userResp= userService.save(user);
		return new ResponseEntity<>(userResp,HttpStatus.OK);
	}
}
