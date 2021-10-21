package com.g98.blog.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g98.blog.model.Post;

@Repository
public interface IPostRepo extends JpaRepository<Post,Long>{
	List<Post> findAllByTitleAndCategory(String title,Long category);
	List<Post> findAllByTitle(String title);
	List<Post> findAllByCategory(Long category);
}
