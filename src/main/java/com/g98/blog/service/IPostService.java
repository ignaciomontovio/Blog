package com.g98.blog.service;

import java.util.List;

import com.g98.blog.model.Post;
import com.g98.blog.model.request.PostDto;

public interface IPostService {

	Post save(PostDto postDto);

	Post delete(Long id);

	Post patch(Long id, PostDto postDto);

	Post getById(Long id);

	List<Post> getPosts();

	List<Post> getPostsByTitle(String title);

	List<Post> getPostsByCategory(Long category);

	Object getPostsByTitleAndCategory(String title, Long category);

}
