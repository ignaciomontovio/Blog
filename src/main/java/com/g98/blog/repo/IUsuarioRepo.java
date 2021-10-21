package com.g98.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g98.blog.model.User;

@Repository
public interface IUsuarioRepo extends JpaRepository<User,Long>{

}
