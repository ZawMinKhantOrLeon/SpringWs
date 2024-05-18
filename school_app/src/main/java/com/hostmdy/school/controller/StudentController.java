package com.hostmdy.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostmdy.school.entity.Major;
import com.hostmdy.school.entity.Student;
import com.hostmdy.school.service.MajorService;
import com.hostmdy.school.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
		
	private final  StudentService studentService;
	private final  MajorService majorService;

	public StudentController(StudentService studentService, MajorService majorService) {
		super();
		this.studentService = studentService;
		this.majorService = majorService;
	}
	
	
	
	@GetMapping("/all")
	
	public String all(Model model) {
		model.addAttribute("students",studentService.getAllStudent());
		return "student-list";
	}
	
	@GetMapping("/create")
	public String form(Model model) {
		model.addAttribute("student",new Student());
		model.addAttribute("majors", majorService.getAllMajor());
		
		return "add-student";
		
	}
	
	@PostMapping("/create")
	public String newStudent(@ModelAttribute Student student, @RequestParam Long majorId) {
		Major major = majorService.getMajorById(majorId);
		
		// major <-> student //
		major.getStudents().add(student);
		student.setMajor(major);
		
		majorService.save(major);
		studentService.save(student);
		
		return "redirect:/student/all";
	}
	
	@GetMapping("/{studentId}")
	public String detail(@PathVariable Long studentId, Model model) {
		Student student = studentService.getStudentById(studentId);
		model.addAttribute("student",student);
		return "student-detail";
	}
}
