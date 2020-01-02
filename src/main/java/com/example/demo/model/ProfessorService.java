package com.example.demo.model;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepo prepo;
	
	public Optional<Professor> getProfessorData(Integer id) {
		
		return prepo.findById(id);
	}
}
