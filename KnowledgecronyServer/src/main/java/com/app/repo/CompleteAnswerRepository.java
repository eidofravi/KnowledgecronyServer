package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.model.CompleteAnswer;

public interface CompleteAnswerRepository extends CrudRepository<CompleteAnswer, Long> {
	CompleteAnswer findByAnswerId(Long answerId);
}
