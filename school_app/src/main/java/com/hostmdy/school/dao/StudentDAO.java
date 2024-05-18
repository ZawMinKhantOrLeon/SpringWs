package com.hostmdy.school.dao;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.school.entity.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {

}
