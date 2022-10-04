package com.btopal.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btopal.issuemanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

		User findByuserName(String userName);
}
