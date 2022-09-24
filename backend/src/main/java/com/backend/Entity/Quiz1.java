package com.backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="quiz1")
public class Quiz1 {
	
	@Id
	@Column(name="QuestionId")
	private int QuestionId;
	
	@Column(name="Question")
	private String Question;
	
	@Column(name="OptionsA")
	private String OptionsA;
	
	@Column(name="OptionsB")
	private String OptionsB;
	
	@Column(name="OptionsC")
	private String OptionsC;
	
	@Column(name="OptionsD")
	private String OptionsD;
	
	@Column(name="Awnser")
	private String Answer;

	public int getQuestionId() {
		return QuestionId;
	}

	public void setQuestionId(int questionId) {
		QuestionId = questionId;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getOptionsA() {
		return OptionsA;
	}

	public void setOptionsA(String optionsA) {
		OptionsA = optionsA;
	}

	public String getOptionsB() {
		return OptionsB;
	}

	public void setOptionsB(String optionsB) {
		OptionsB = optionsB;
	}

	public String getOptionsC() {
		return OptionsC;
	}

	public void setOptionsC(String optionsC) {
		OptionsC = optionsC;
	}

	public String getOptionsD() {
		return OptionsD;
	}

	public void setOptionsD(String optionsD) {
		OptionsD = optionsD;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}
	
	
	

}
