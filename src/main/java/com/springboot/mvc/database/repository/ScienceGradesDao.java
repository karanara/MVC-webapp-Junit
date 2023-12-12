package com.springboot.mvc.database.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.mvc.database.models.ScienceGrade;

public interface ScienceGradesDao extends CrudRepository<ScienceGrade, Integer> {

    public Iterable<ScienceGrade> findGradeByStudentId(int id);

    public void deleteByStudentId(int id);
}
