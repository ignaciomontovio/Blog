package com.g98.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.g98.blog.model.Post;
import com.g98.blog.model.request.PostDto;
import com.g98.blog.service.IPostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	private IPostService postService;
	
	@GetMapping( value = "")
	public ResponseEntity<?> getPostsByParams(@RequestParam(required = false) String title,@RequestParam(required = false) Long category) {
		if(title == null && category == null)
			return new ResponseEntity<>(postService.getPosts(),HttpStatus.ACCEPTED);
		else
			if(title == null)
				return new ResponseEntity<List<Post>>(postService.getPostsByCategory(category),HttpStatus.ACCEPTED);
				
			else
				if(category == null)
					return new ResponseEntity<List<Post>>(postService.getPostsByTitle(title),HttpStatus.ACCEPTED);
				else
					return new ResponseEntity<>(postService.getPostsByTitleAndCategory(title,category),HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping( value = "/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable(value = "id")Long id) {
		return new ResponseEntity<Post>(postService.getById(id),HttpStatus.ACCEPTED);
	}
	
	@PostMapping( value = "")
	public ResponseEntity<Post> createPost(@RequestBody PostDto postDto) {
		
		return new ResponseEntity<Post>(postService.save(postDto),HttpStatus.OK);
	}
	
	@PatchMapping( value = "/{id}")
	public ResponseEntity<Post> patchPost(@PathVariable(value = "id")Long id,@RequestBody PostDto postDto) {
		return new ResponseEntity<Post>(postService.patch(id,postDto),HttpStatus.OK);
	}
	
	@DeleteMapping( value = "/{id}")
	public ResponseEntity<Post> deletePost(@PathVariable(value = "id")Long id) {
		return new ResponseEntity<Post>(postService.delete(id),HttpStatus.OK);
	}
}
