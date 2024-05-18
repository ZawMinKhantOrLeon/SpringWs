package com.hostmdy.school.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hostmdy.school.dao.StudentDAO;
import com.hostmdy.school.entity.Student;

@Service
public class StudentService {
	
	private final StudentDAO studentDAO;

	public StudentService(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}
	
	
	public List<Student> getAllStudent() {
		return    (List<Student>) studentDAO.findAll();
	}
	
	
	public Student getStudentById(Long studentId) {
		Optional<Student> studentOptional = studentDAO.findById(studentId);
		
		if(studentOptional.isEmpty()) {
			throw new RuntimeException("Student with Id : "+ studentId + " is not found");
		}
		
		return studentOptional.get();
	}
	
	public Student save(Student student) {
		return studentDAO.save(student);
	}
}
