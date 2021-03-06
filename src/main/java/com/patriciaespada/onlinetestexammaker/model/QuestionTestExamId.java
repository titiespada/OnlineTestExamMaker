package com.patriciaespada.onlinetestexammaker.model;
// Generated 5/jan/2018 22:51:25 by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuestionTestExamId generated by hbm2java
 */
@Embeddable
public class QuestionTestExamId implements java.io.Serializable {

	private int questionId;
	private int testExamId;

	public QuestionTestExamId() {
	}

	public QuestionTestExamId(int questionId, int testExamId) {
		this.questionId = questionId;
		this.testExamId = testExamId;
	}

	@Column(name = "question_id", nullable = false)
	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	@Column(name = "test_exam_id", nullable = false)
	public int getTestExamId() {
		return this.testExamId;
	}

	public void setTestExamId(int testExamId) {
		this.testExamId = testExamId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuestionTestExamId))
			return false;
		QuestionTestExamId castOther = (QuestionTestExamId) other;

		return (this.getQuestionId() == castOther.getQuestionId())
				&& (this.getTestExamId() == castOther.getTestExamId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getQuestionId();
		result = 37 * result + this.getTestExamId();
		return result;
	}

}
