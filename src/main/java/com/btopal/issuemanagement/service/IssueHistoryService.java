package com.btopal.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.btopal.issuemanagement.entity.IssueHistory;

@Repository
public interface IssueHistoryService {

	IssueHistory save(IssueHistory issueHistory);
	IssueHistory getById(Long id);
	Page<IssueHistory> getAllPageable(Pageable pageable);
	Boolean delete (IssueHistory issueHistory);
}
