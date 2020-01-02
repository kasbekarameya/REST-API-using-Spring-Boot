package com.example.demo.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Professor;
import com.example.demo.model.ProfessorService;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService serve;
	
	@RequestMapping(value="/getProfessorById/{id}",method=RequestMethod.GET)
	public Optional<Professor> getProfessor(@PathVariable("id") Integer id) {
		return serve.getProfessorData(id);
	}
}
