package com.hostmdy.school.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.hostmdy.school.dao.MajorDAO;
import com.hostmdy.school.entity.Major;

@Service
public class MajorService {
	
	private final MajorDAO majorDAO;

	public MajorService(MajorDAO majorDAO) {
		super();
		this.majorDAO = majorDAO;
	}
	
	public List<Major> getAllMajor(){
		return (List<Major>) majorDAO.findAll();
	}
	
	public Major save(Major major) {
		return majorDAO.save(major);
	}
	
	public Major getMajorById(Long majorId) {
		java.util.Optional<Major> majorOptional= majorDAO.findById(majorId);
		
		if(majorOptional.isEmpty()) {
			throw new RuntimeException("Major with Id : "+ majorId +" is not found");
		}
		return majorOptional.get();
	}
	
	public void deleteMajorById(Long majorId) {
		majorDAO.deleteById(majorId);
	}
}
