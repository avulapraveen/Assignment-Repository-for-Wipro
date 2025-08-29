//package com.pk.example.repositories;
//
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.pk.example.entities.User;
//
//
//@Repository
//public interface UserRepository extends JpaRepository<User,Long> {
//
//	List<User> findByName(String name);
//
//	List<User> findByNameIgnoreCase(String name);
//
//	
package com.pk.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;



import java.util.List;

public interface UserRepository extends JpaRepository<Task, Long> {
    List<Task> findByPriority(String priority);
}
//
//
//	
//
//}
