package com.btopal.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btopal.issuemanagement.entity.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long>{
	
	
}
