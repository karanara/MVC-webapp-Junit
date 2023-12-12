package com.springboot.mvc.database.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.mvc.database.models.MathGrade;

public interface MathGradesDao extends CrudRepository<MathGrade, Integer> {

    public Iterable<MathGrade> findGradeByStudentId(int id);

    public void deleteByStudentId(int id);
}
