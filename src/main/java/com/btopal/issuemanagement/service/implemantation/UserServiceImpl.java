package com.btopal.issuemanagement.service.implemantation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.btopal.issuemanagement.entity.User;
import com.btopal.issuemanagement.repository.UserRepository;
import com.btopal.issuemanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		if(user.getEmail() == null)
		{
			throw new IllegalArgumentException("User Email cannot be null");
		}
		return userRepository.save(user);
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.getReferenceById(id);
	}

	@Override
	public Page<User> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return userRepository.findAll(pageable);
	}

	@Override
	public User getByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
