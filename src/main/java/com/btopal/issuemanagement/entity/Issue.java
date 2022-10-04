package com.btopal.issuemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "description",length = 100)
	private String description;
	@Column(name = "details",length = 4000)
	private String details;
	@Column(name = "date")
	private Date date;
	@Column(name = "issue_status")
	@Enumerated(EnumType.STRING)
	private IssueStatus issueStatus;
	
	@JoinColumn(name="assinee_user_id")
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	private User assignee;
	
	@JoinColumn(name="project_id")
	@ManyToOne(optional = true,fetch = FetchType.LAZY)
	private Project project;
}

