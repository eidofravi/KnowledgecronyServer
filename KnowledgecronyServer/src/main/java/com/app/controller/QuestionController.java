package com.app.controller;
 
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Question;
import com.app.repo.QuestionRepository;
 
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class QuestionController {
	
	@Autowired
	QuestionRepository questionRepository;
	
	@GetMapping(value = "/question")
    public List<Question> getQuestion() throws IOException {
		return questionRepository.findAll();
    }
	
}