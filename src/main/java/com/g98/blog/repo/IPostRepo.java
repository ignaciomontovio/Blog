package com.g98.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g98.blog.model.Post;

@Repository
public interface IPostRepo extends JpaRepository<Post,Long>{

}
