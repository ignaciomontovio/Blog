package com.g98.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g98.blog.model.Category;
import com.g98.blog.model.Post;
import com.g98.blog.model.request.CategoryDto;
import com.g98.blog.model.request.PostDto;
import com.g98.blog.service.ICategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping( value = "")
	public ResponseEntity<Category> createPost(@RequestBody CategoryDto categoryDto) {
		
		return new ResponseEntity<Category>(categoryService.save(categoryDto),HttpStatus.OK);
	}
}
