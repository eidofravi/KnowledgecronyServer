package com.app.dto;

import java.util.List;

import com.app.model.Answer;
import com.app.model.Question;

public class QuestionWithAnswer {
	
	private Question question;
	private List<Answer> answer;
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}
	
	

}
