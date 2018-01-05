package com.titiespada.onlinetestexammaker.model;

// default package
// Generated 4/jan/2018 17:26:31 by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Question generated by hbm2java
 */
@Entity
@Table(name = "question")
public class Question implements java.io.Serializable {

	private int id;
	private String title;
	private String problemDescription;
	private boolean haveMoreThanOneAnswer;
	private int order;
	private Set questionChoiceAnswers = new HashSet(0);
	private Set testExams = new HashSet(0);

	public Question() {
	}

	public Question(int id, String title, String problemDescription, boolean haveMoreThanOneAnswer, int order) {
		this.id = id;
		this.title = title;
		this.problemDescription = problemDescription;
		this.haveMoreThanOneAnswer = haveMoreThanOneAnswer;
		this.order = order;
	}

	public Question(int id, String title, String problemDescription, boolean haveMoreThanOneAnswer, int order,
			Set questionChoiceAnswers, Set testExams) {
		this.id = id;
		this.title = title;
		this.problemDescription = problemDescription;
		this.haveMoreThanOneAnswer = haveMoreThanOneAnswer;
		this.order = order;
		this.questionChoiceAnswers = questionChoiceAnswers;
		this.testExams = testExams;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "title", nullable = false, length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "problem_description", nullable = false, length = 1000)
	public String getProblemDescription() {
		return this.problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	@Column(name = "have_more_than_one_answer", nullable = false)
	public boolean isHaveMoreThanOneAnswer() {
		return this.haveMoreThanOneAnswer;
	}

	public void setHaveMoreThanOneAnswer(boolean haveMoreThanOneAnswer) {
		this.haveMoreThanOneAnswer = haveMoreThanOneAnswer;
	}

	@Column(name = "order", nullable = false)
	public int getOrder() {
		return this.order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "question")
	public Set getQuestionChoiceAnswers() {
		return this.questionChoiceAnswers;
	}

	public void setQuestionChoiceAnswers(Set questionChoiceAnswers) {
		this.questionChoiceAnswers = questionChoiceAnswers;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "question_test_exam", joinColumns = {
			@JoinColumn(name = "question_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "test_exam_id", nullable = false, updatable = false) })
	public Set getTestExams() {
		return this.testExams;
	}

	public void setTestExams(Set testExams) {
		this.testExams = testExams;
	}

}