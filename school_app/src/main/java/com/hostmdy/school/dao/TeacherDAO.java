package com.hostmdy.school.dao;

import org.springframework.data.repository.CrudRepository;

import com.hostmdy.school.entity.Teacher;

public interface TeacherDAO extends CrudRepository<Teacher, Long> {

}
