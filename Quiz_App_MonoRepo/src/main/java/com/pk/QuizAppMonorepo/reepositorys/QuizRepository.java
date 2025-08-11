package com.pk.QuizAppMonorepo.reepositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.QuizAppMonorepo.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // No need to declare findById – inherited from JpaRepository
}
