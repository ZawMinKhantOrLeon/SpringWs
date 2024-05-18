package com.hostmdy.school.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostmdy.school.entity.Student;
import com.hostmdy.school.entity.Teacher;
import com.hostmdy.school.service.StudentService;
import com.hostmdy.school.service.TeacherService;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	private final TeacherService teacherService;
	private final StudentService studentService;

	public TeacherController(TeacherService teacherService, StudentService studentService) {
		super();
		this.teacherService = teacherService;
		this.studentService = studentService;
	}
	
	@GetMapping("/all")
	public String all(Model model) {
		
		model.addAttribute("teachers",teacherService.getAllTeacher());
		return "teacher-list";
		
	}
	
	@GetMapping("/{teacherId}")
	public String id(@PathVariable Long teacherId,Model model) {
		
		Teacher teacher = teacherService.getTeacherById(teacherId);
		model.addAttribute("teacher", teacher);
		return "teacher-detail";
     }
	
	@GetMapping("/create")
	public String form(Model model) {
		model.addAttribute("teacher", new Teacher());
		
		return "add-teacher";
	}
	
	@PostMapping("/create")
	public String newTeacher(@ModelAttribute Teacher teacher) {
		teacherService.saveTeacher(teacher);
		return "redirect:/teacher/all";
	}
	
	@GetMapping("/{teacherId}/assign")
	public String assignForm(@PathVariable Long teacherId,Model model) {
		
		Teacher teacher = teacherService.getTeacherById(teacherId);
		model.addAttribute("students",studentService.getAllStudent());
		model.addAttribute("teacher", teacher);
		
		return "assign-student";
		
	}
	
	@PostMapping("/assign")
	
	public String assign(@RequestParam Long teacherId, @RequestParam Long studentId) {
		
		Teacher teacher = teacherService.getTeacherById(teacherId);
		Student student = studentService.getStudentById(studentId);
		
		teacher.getStudents().add(student);
		student.getTeachers().add(teacher);
		
		studentService.save(student);
		teacherService.saveTeacher(teacher);
	
		
		return "redirect:/teacher/all";
		
	}
	
}
