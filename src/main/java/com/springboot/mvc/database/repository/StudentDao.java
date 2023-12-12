package com.springboot.mvc.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mvc.database.models.CollegeStudent;

@Repository
public interface StudentDao extends CrudRepository<CollegeStudent, Integer> {

    public CollegeStudent findByEmailAddress(String emailAddress);
}
