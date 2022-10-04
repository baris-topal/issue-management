package com.btopal.issuemanagement.service.implemantation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.btopal.issuemanagement.entity.IssueHistory;
import com.btopal.issuemanagement.repository.IssueHistoryRepository;
import com.btopal.issuemanagement.service.IssueHistoryService;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService{

	private final IssueHistoryRepository issueHistoryRepository; 
	
	@Autowired
	public IssueHistoryServiceImpl(IssueHistoryRepository issueHistoryRepository) {
		this.issueHistoryRepository=issueHistoryRepository;
	}
	
	@Override
	public IssueHistory save(IssueHistory issueHistory) {
		// TODO Auto-generated method stub
		if(issueHistory.getDate() == null)
		{
			throw new IllegalArgumentException("Date cannot be null");
		}
		return issueHistoryRepository.save(issueHistory);
	}

	@Override
	public IssueHistory getById(Long id) {
		// TODO Auto-generated method stub
		return issueHistoryRepository.getReferenceById(id);
	}

	@Override
	public Page<IssueHistory> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return issueHistoryRepository.findAll(pageable);
	}

	@Override
	public Boolean delete(IssueHistory issueHistory) {
		// TODO Auto-generated method stub
		issueHistoryRepository.delete(issueHistory);
		return Boolean.TRUE;
	}

}
