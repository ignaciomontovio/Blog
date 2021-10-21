package com.g98.blog.model.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import com.g98.blog.model.Category;
import com.g98.blog.model.Post;
import com.g98.blog.model.User;
import com.g98.blog.model.request.PostDto;

public class PostBuilder {
	private String title;
	private String content;
	private String image;
	private User user;
	private Category category;
	
	public PostBuilder withPostDto(PostDto postDto) throws ParseException {
		this.title = postDto.getTitle();
		this.content = postDto.getContent();
		this.image=postDto.getImage();
		if(postDto.getIdUser() != null)
			this.user = new User(postDto.getIdUser());
		if(postDto.getIdCategory() != null)
			this.category = new Category(postDto.getIdCategory());
		
		return this;
	}
	
	public Post build() {
		return new Post(title,content,image,user,category);
		
	}
}
