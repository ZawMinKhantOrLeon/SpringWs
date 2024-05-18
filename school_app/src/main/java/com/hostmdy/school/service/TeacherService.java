package com.hostmdy.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hostmdy.school.dao.TeacherDAO;
import com.hostmdy.school.entity.Teacher;

@Service
public class TeacherService {
	
	private final TeacherDAO teacherDAO;

	public TeacherService(TeacherDAO teacherDAO) {
		super();
		this.teacherDAO = teacherDAO;
	}
	
	public List<Teacher> getAllTeacher(){
			return (List<Teacher>) teacherDAO.findAll();
	}
	
	public Teacher getTeacherById(Long teacherId) {
		Optional<Teacher>  teacherOptional=  teacherDAO.findById(teacherId);
		
		if(teacherOptional.isEmpty()) {
			throw new RuntimeException("Teacher with id "+ teacherId + " is not found");
		}
		
		return teacherOptional.get();
	}
	
	public Teacher saveTeacher(Teacher teacher) {
			
		return teacherDAO.save(teacher);
	}
}
