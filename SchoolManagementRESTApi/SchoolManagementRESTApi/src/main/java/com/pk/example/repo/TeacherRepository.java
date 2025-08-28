package com.pk.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pk.example.entities.Teacher;
import com.pk.example.entities.Teacher.Qualification;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	List<Teacher> findByQualification(Qualification qualification);

	void deleteByTeacherAddress(String teacherAddress);

}
