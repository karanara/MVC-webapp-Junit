package com.springboot.mvc.database.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.mvc.database.models.HistoryGrade;

public interface HistoryGradesDao extends CrudRepository<HistoryGrade, Integer> {

    public Iterable<HistoryGrade> findGradeByStudentId(int id);

    public void deleteByStudentId(int id);
}
