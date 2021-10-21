package com.g98.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g98.blog.model.Category;

@Repository
public interface ICategoryRepo extends JpaRepository<Category,Long>{

}
