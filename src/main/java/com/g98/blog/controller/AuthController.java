package com.g98.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping( value = "/sing_up")
	public ResponseEntity<?> singUpUser() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@PostMapping( value = "/login")
	public ResponseEntity<?> loginUser() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
}
