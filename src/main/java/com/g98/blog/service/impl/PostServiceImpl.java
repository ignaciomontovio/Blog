package com.g98.blog.service.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.g98.blog.model.Category;
import com.g98.blog.model.Post;
import com.g98.blog.model.builder.PostBuilder;
import com.g98.blog.model.request.PostDto;
import com.g98.blog.repo.IPostRepo;
import com.g98.blog.service.IPostService;

@Service
public class PostServiceImpl implements IPostService{
	
	@Autowired
	private IPostRepo postRepo;

	@Override
	public Post save(PostDto postDto) {
		Post post;
		try {
			post = new PostBuilder().withPostDto(postDto).build();
		} catch (ParseException e) {
			System.out.println("Error Date Format");
			e.printStackTrace();
			return null;
		}
		return postRepo.save(post);
	}

	@Override
	public Post delete(Long id) {
		Post post = postRepo.findById(id).get();
		postRepo.deleteById(id);
		return post;
	}

	@Override
	public Post patch(Long id, PostDto postDto) {
		Post post = postRepo.findById(id).get();
		
		if(postDto.getContent() != null)
			post.setContent(postDto.getContent());
		if(postDto.getIdCategory() != null)
			post.setCategory(new Category(postDto.getIdCategory()));
		if(postDto.getImage() != null)
			post.setImage(postDto.getImage());
		if(postDto.getTitle() != null)
			post.setTitle(postDto.getTitle());
			
		post = postRepo.save(post);
		return post;
	}

	@Override
	public Post getById(Long id) {
		Post post = postRepo.findById(id).get();
		return post;
	}

	@Override
	public List<Post> getPosts() {
		List<Post> posts = postRepo.findAll(Sort.by(Sort.Direction.ASC, "creationDate"));
		return posts;
	}

	@Override
	public List<Post> getPostsByTitle(String title) {
		List<Post> posts = postRepo.findAllByTitle(title);
		return posts;
	}

	@Override
	public List<Post> getPostsByCategory(Long category) {
		List<Post> posts = postRepo.findAllByCategory(category);
		return posts;
	}

	@Override
	public List<Post> getPostsByTitleAndCategory(String title, Long category) {
		List<Post> posts = postRepo.findAllByTitleAndCategory(title,category);
		return posts;
	}
}
