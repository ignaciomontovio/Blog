package com.g98.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g98.blog.model.Category;
import com.g98.blog.model.request.CategoryDto;
import com.g98.blog.repo.ICategoryRepo;
import com.g98.blog.service.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ICategoryRepo categoryRepo;

	@Override
	public Category save(CategoryDto categoryDto) {
		return categoryRepo.save(new Category(categoryDto.getName()));
	}
}
