package com.g98.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

	@GetMapping( value = "")
	public ResponseEntity<?> getPosts() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping( value = "/{id}")
	public ResponseEntity<?> getPostById(@PathVariable(value = "id")Long id) {
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
//	@GetMapping( value = "")
//	public ResponseEntity<?> getPostsByParams(@RequestParam(defaultValue = "") String title,
//			@RequestParam(defaultValue = "0") Long category) {
//		return new ResponseEntity<>(HttpStatus.ACCEPTED);
//	}
	
	@PostMapping( value = "")
	public ResponseEntity<?> createPost() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PatchMapping( value = "/{id}")
	public ResponseEntity<?> patchPost(@PathVariable(value = "id")Long id) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping( value = "/{id}")
	public ResponseEntity<?> deletePost(@PathVariable(value = "id")Long id) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
