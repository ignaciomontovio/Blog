package com.g98.blog.service;

import org.springframework.stereotype.Service;

import com.g98.blog.model.Category;
import com.g98.blog.model.request.CategoryDto;

@Service
public interface ICategoryService {

	Category save(CategoryDto categoryDto);

}
