package com.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {
	
	List<Question> findAll();

	Question save(Question question);
}
