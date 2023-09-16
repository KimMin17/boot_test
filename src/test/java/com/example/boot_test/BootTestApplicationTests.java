package com.example.boot_test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class BootTestApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private AnswerRepository answerRepository;

	@Transactional
	@Test
	void testJpa() {
		/*
		List<Question> all = this.questionRepository.findAll();
		assertEquals(4, all.size());

		Question q = all.get(0);
		assertEquals("What is sbb?", q.getSubject());
		*/

		/*
		Optional<Question> oq = this.questionRepository.findById(1);

		if(oq.isPresent()) {
			Question q = oq.get();
			assertEquals("What is sbb?", q.getSubject());
		}
		*/

		/*
		Question q = this.questionRepository.findBySubject("What is sbb?");
		assertEquals(1, q.getId());
		*/

		/*
		Question q = this.questionRepository.findBySubjectAndContent("What is sbb?", "I wanna know about sbb");
		assertEquals(1, q.getId());
		*/

		/*
		List<Question> qList = this.questionRepository.findBySubjectLike("%sbb%");
		Question q = qList.get(0);
		assertEquals("What is sbb?", q.getSubject());
		*/

		/*
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		q.setSubject("modified subject");
		this.questionRepository.save(q);
		*/
		
		/*
		assertEquals(2, this.questionRepository.count());
		Optional<Question> oq = this.questionRepository.findById(1);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		this.questionRepository.delete(q);
		assertEquals(1, this.questionRepository.count());
		*/

		/*
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		Answer a = new Answer();
		a.setContent("Yes, It is created automatically");
		a.setQuestion(q);

		a.setCreateDate(LocalDateTime.now());
		this.answerRepository.save(a);
		*/

		/*
		Optional<Answer> oa = this.answerRepository.findById(1);
		assertTrue(oa.isPresent());
		Answer a = oa.get();
		assertEquals(2, a.getQuestion().getId());
		*/
		
		Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();

		List<Answer> answerList = q.getAnswerList();

		assertEquals(1, answerList.size());
		assertEquals("Yes, It is created automatically", answerList.get(0).getContent());

	}
}
