package com.g98.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.g98.blog.model.User;
import com.g98.blog.model.request.UserDto;
import com.g98.blog.model.response.UserResponse;
import com.g98.blog.repo.IUserRepo;
import com.g98.blog.service.IUserService;



@Service
public class UserService implements UserDetailsService,IUserService{

	@Autowired
	private IUserRepo userRepo;
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.g98.blog.model.User us = userRepo.findByUsername(username); 
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		UserDetails userDet = new org.springframework.security.core.userdetails.User(us.getUsername(), us.getPassword(), roles);
		return userDet;
	}

	@Override
	public UserResponse save(UserDto userDto) {
		User user = userRepo.save(new User(userDto.getUsername(),bcrypt.encode(userDto.getPassword()),userDto.getEmail()));
		return new UserResponse(user.getEmail(),user.getUsername());
	}
	
	

}