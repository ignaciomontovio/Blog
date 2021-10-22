package com.g98.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g98.blog.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User,Long>{
	User findByUsername(String username);
}
