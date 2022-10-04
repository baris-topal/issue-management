package com.btopal.issuemanagement.service.implemantation;


import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.btopal.issuemanagement.dto.IssueDto;
import com.btopal.issuemanagement.entity.Issue;
import com.btopal.issuemanagement.repository.IssueRepository;
import com.btopal.issuemanagement.service.IssueService;
import com.btopal.issuemanagement.util.TPage;

@Service
public class IssueServiceImpl implements IssueService{

	private final IssueRepository issueRepository;
	private final ModelMapper modelMapper;
	
	@Autowired
	public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper) {
		this.issueRepository = issueRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public IssueDto save(IssueDto issue) {
		// TODO Auto-generated method stub
		if(issue.getDate() == null)
		{
			throw new IllegalArgumentException("Date cannot be null");
		}
		Issue issueDB = modelMapper.map(issue, Issue.class);
		issueDB = issueRepository.save(issueDB);
		return modelMapper.map(issueDB, IssueDto.class);
	}

	@Override
	public IssueDto getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TPage<IssueDto> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		Page<Issue> data = issueRepository.findAll(pageable);
		TPage page = new TPage<IssueDto>();
		IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
		page.setStat(data, Arrays.asList(dtos));
		return page;
	}

	@Override
	public Boolean delete(IssueDto issue) {
		// TODO Auto-generated method stub
		return null;
	}
	
}