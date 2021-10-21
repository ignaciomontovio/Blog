package com.g98.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g98.blog.repo.IUserRepo;
import com.g98.blog.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserRepo userRepo;
}
