package com.pk.student.service;

import java.util.List;

import com.pk.student.entities.Student;


public interface StudentService {

	public List<Student> getAll();

	public void save(Student student);

	public Student getById(String id);

	public void delete(String id);

}
