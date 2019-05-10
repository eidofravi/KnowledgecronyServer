package com.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	Answer findByAnswerId(Long answerId);
	List<Answer> findAnswerByQuestionId(Long questionId);
}
