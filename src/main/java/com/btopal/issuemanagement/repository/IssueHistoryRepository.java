package com.btopal.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btopal.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long>{

}
