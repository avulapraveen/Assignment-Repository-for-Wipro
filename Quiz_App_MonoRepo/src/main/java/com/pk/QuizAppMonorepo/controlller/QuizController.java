package com.pk.QuizAppMonorepo.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.QuizAppMonorepo.entities.QuestionWrapper;
import com.pk.QuizAppMonorepo.entities.Quiz;
import com.pk.QuizAppMonorepo.entities.Response;
import com.pk.QuizAppMonorepo.servicess.QuizServiceImpl;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	private QuizServiceImpl quizService;

	@PostMapping("/create")
	public Quiz createQuiz(@RequestParam String category, @RequestParam String level, @RequestParam String title) {
		return quizService.createQuiz(category, level, title);
	}

	@GetMapping("/get/{id}/questions")
	public List<QuestionWrapper> getQuizQuestions(@PathVariable Long id) {
		return quizService.getQuizQuestions(id);
	}

	@PostMapping("/cal/{id}/submit")
	public Integer calculateScore(@PathVariable Long id, @RequestBody List<Response> responses) {
		return quizService.calculateResult(id, responses);
	}
}
