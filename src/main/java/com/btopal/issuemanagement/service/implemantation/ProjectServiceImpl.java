package com.btopal.issuemanagement.service.implemantation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.btopal.issuemanagement.entity.Project;
import com.btopal.issuemanagement.repository.ProjectRepository;
import com.btopal.issuemanagement.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	private final ProjectRepository projectRepository;
	
	@Autowired
	public ProjectServiceImpl(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	@Override
	public Project save(Project project) {
		if(project.getProjectCode() == null)
		{
			throw new IllegalArgumentException("Project code cannot be null");
		}
		return projectRepository.save(project);
	}

	@Override
	public Project getById(Long id) {
		// TODO Auto-generated method stub
		return projectRepository.getReferenceById(id);
	}

	@Override
	public Page<Project> getAllPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return projectRepository.findAll(pageable);
	}

	@Override
	public List<Project> getByProjectCode(String projectCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getByProjectCodeContains(String projectCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Project project) {
		// TODO Auto-generated method stub
		projectRepository.delete(project);
		return Boolean.TRUE;
	}

}
