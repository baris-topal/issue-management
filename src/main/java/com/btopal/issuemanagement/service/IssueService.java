package com.btopal.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.btopal.issuemanagement.dto.IssueDto;
import com.btopal.issuemanagement.entity.Issue;
import com.btopal.issuemanagement.util.TPage;

public interface IssueService {

	IssueDto save(IssueDto issue);
	IssueDto getById(Long id);
	TPage<IssueDto> getAllPageable(Pageable pageable);
	Boolean delete (IssueDto issue);
}
