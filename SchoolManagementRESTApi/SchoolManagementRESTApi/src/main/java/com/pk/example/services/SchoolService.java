package com.pk.example.services;

import java.util.List;

import com.pk.example.entities.School;

public interface SchoolService {

	School saveSchool(School school);

	List<School> findAllSchools();

	School updateSchool(Long id, School s);

	School patchSchoolName(Long id, String name);

	void deleteSchool(Long id);

	List<School> getSchoolByAddress(String schoolAddress);

	void deleteByAddress(String schoolAddress);
	
	List<School> searchSchoolsByName(String keyword);

}
