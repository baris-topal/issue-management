package com.btopal.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.btopal.issuemanagement.entity.User;

public interface UserService {

	User save(User user);
	User getById(Long id);
	Page<User> getAllPageable(Pageable pageable);
	User getByUsername(String userName);
}
