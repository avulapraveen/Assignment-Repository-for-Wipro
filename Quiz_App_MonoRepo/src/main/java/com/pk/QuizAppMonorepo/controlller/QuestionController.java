package com.pk.QuizAppMonorepo.controlller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pk.QuizAppMonorepo.entities.Question;
import com.pk.QuizAppMonorepo.servicess.QuestionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class QuestionController {

 
	private final QuestionService questionService;



	@GetMapping("/getQuestionsById/{id}")
	public Question getById(@PathVariable long id) {
		return questionService.getQuestionById(id);
	}

	@GetMapping("/getAllQuestions")
	public List<Question> getAll() {
		return questionService.getAllQuestions();
	}
	
	@PostMapping("/SaveQuestions")
	public Question create(@RequestBody Question question) {
		return questionService.createQuestion(question);
	}

	@PatchMapping("/updateQuestion/{id}")
	public Question update(@PathVariable long id, @RequestBody Question question) {
		return questionService.updateQuestion(id, question);
	}

	@DeleteMapping("/deleteQuestionById/{id}")
	public String delete(@PathVariable long id) {
		questionService.deleteQuestion(id);
		return "Deleted Successfully";
	}
}
