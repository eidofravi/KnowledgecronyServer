package com.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "category")
	private String category;

	@Column(name = "categoryDesc")
	private String categoryDesc;

	@Column(name = "question")
	private String question;
	
	/*
	 * @OneToOne(cascade={CascadeType.ALL})
	 * 
	 * @JoinColumn(name="answerId", unique=true) private Answer answer;
	 */
	
	/*
	 * @OneToMany(cascade={CascadeType.ALL})
	 * 
	 * @JoinColumn(name="answerId", unique=true) private List<CompleteAnswer>
	 * completeAnswer;
	 */


	public Question() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	

	}
