package com.app.controller;
 
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.QuestionWithAnswer;
import com.app.model.Answer;
import com.app.model.Question;
import com.app.repo.AnswerRepository;
import com.app.repo.ImageRepository;
import com.app.repo.QuestionRepository;
 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AnswerController {
	
	@Autowired
	ImageRepository repository;
	
	@Autowired
	AnswerRepository answerRepository;
	
	@Autowired
	QuestionRepository questionRepository;
	
	@GetMapping(value = "/answers")
    public List<Answer> getAnswer() throws IOException {
		return answerRepository.findAnswerByQuestionId(1L);
    }
	
	@GetMapping(value = "/answer/{id}")
    public List<Answer> getAnswerById(@PathVariable("id") long id) throws IOException {
		return answerRepository.findAnswerByQuestionId(id);
    }
	
	@PostMapping(value = "/createQuestionWithAnswer")
    public void postQuestionWithAnswer(@RequestBody QuestionWithAnswer questionWithAnswer) throws IOException {
		System.out.println(questionWithAnswer);
		Question question = new Question();
		question.setQuestion(questionWithAnswer.getQuestion().getQuestion());
		question.setCategoryDesc(questionWithAnswer.getQuestion().getCategoryDesc());
		question.setAnswer(new HashSet(questionWithAnswer.getAnswer()));
		questionRepository.save(question);
    }
	
}