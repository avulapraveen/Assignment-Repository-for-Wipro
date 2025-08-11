package com.pk.QuizAppMonorepo.servicess;

import java.util.List;

import com.pk.QuizAppMonorepo.entities.Question;

public interface QuestionService {
	Question createQuestion(Question question);
    Question getQuestionById(long id);
    List<Question> getAllQuestions();
    Question updateQuestion(long id, Question question);
    void deleteQuestion(long id);
}
