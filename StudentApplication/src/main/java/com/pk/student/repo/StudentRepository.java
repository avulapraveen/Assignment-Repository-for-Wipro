package com.pk.student.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pk.student.entities.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
