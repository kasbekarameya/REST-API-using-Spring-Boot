package com.example.demo;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Professor;

public class ProfessorConsumer {

	//private static final Logger log = LoggerFactory.getLogger(ProfessorConsumer.class);
	
	public static void consumeProfessor(String args[]) {
		
		RestTemplate rtemp = new RestTemplate();
		
		for(int i=1; i<=3; i++) {
			ResponseEntity<Professor> po = rtemp.getForEntity("/getProfessorById/"+i, Professor.class);
			System.out.println("Consumed professor values for Professor Id:"+i+":"+po.toString());
		}
	}
}
