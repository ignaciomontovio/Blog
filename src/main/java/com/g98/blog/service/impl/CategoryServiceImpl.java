package com.g98.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g98.blog.repo.ICategoryRepo;

@Service
public class CategoryServiceImpl {
	
	@Autowired
	private ICategoryRepo categoryRepo;
}
