package com.hostmdy.school.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hostmdy.school.entity.Major;
import com.hostmdy.school.service.MajorService;

@Controller
@RequestMapping("/major")
public class MajorController {
	
	private final MajorService majorService;

	public MajorController(MajorService majorService) {
		super();
		this.majorService = majorService;
	}
	
	@GetMapping("/all")
	public String all(Model model) {
		java.util.List<Major> majors = majorService.getAllMajor();
		model.addAttribute("majors",majors);
		return "major-list";
	}
	
	@GetMapping("/{majorId}/update")
	public String updaetForm(@PathVariable Long majorId,Model model) {
		Major major = majorService.getMajorById(majorId);
		model.addAttribute("major",major);
		return "add-major";
	}
	
	@GetMapping("/create")
	
	public String form(Model model) {
		
		model.addAttribute("major",new Major());
		return "add-major";
	}
	
	@PostMapping("/create")
	
	public String newMajor(@ModelAttribute Major major) {
		Major savedMajor = majorService.save(major);
		System.out.println("Major with id :"+ major.getId()+ " is saved ");
		return "redirect:/major/all";
	}
	
	
	@GetMapping("/{majorId}/delete")
	public String delete(@PathVariable Long majorId) {
		majorService.deleteMajorById(majorId);
		
		return "redirect:/major/all";
	}
	
	@GetMapping("{majorId}")
	public String detail(@PathVariable Long majorId,Model model) {
		Major major=majorService.getMajorById(majorId);
		model.addAttribute("major",major);
		return "major-detail";
	}
}
