package com.pk.QuizAppMonorepo.exceptions;


public  class QuestionNotFoundException extends RuntimeException {
    public QuestionNotFoundException(String message) {
        super(message);
    }
}
