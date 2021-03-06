package com.patriciaespada.onlinetestexammaker.model;
// Generated 5/jan/2018 14:15:23 by Hibernate Tools 5.2.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TestExamUserId generated by hbm2java
 */
@Embeddable
public class TestExamUserId implements java.io.Serializable {

	private int testExamId;
	private int userId;

	public TestExamUserId() {
	}

	public TestExamUserId(int testExamId, int userId) {
		this.testExamId = testExamId;
		this.userId = userId;
	}

	@Column(name = "test_exam_id", nullable = false)
	public int getTestExamId() {
		return this.testExamId;
	}

	public void setTestExamId(int testExamId) {
		this.testExamId = testExamId;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TestExamUserId))
			return false;
		TestExamUserId castOther = (TestExamUserId) other;

		return (this.getTestExamId() == castOther.getTestExamId()) && (this.getUserId() == castOther.getUserId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTestExamId();
		result = 37 * result + this.getUserId();
		return result;
	}

}
