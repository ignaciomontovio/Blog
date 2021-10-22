package com.g98.blog.service;

import com.g98.blog.model.request.UserDto;
import com.g98.blog.model.response.UserResponse;

public interface IUserService {

	UserResponse save(UserDto userDto);

}
