package com.app.controller;
 
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Answer;
import com.app.repo.AnswerRepository;
import com.app.repo.ImageRepository;
 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AnswerController {
	
	@Autowired
	ImageRepository repository;
	
	@Autowired
	AnswerRepository answerRepository;
	
	@GetMapping(value = "/answer")
    public List<Answer> getAnswer() throws IOException {
		return answerRepository.findAnswerByQuestionId(1L);
    }
	
}