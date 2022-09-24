package com.backend.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Entity.Quiz1;
import com.backend.Repository.Quiz1Repository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Quiz1Controller {
	
	@Autowired
	Quiz1Repository quizRepo;
	
	@GetMapping("/quiz1")
	  public ResponseEntity<List<Quiz1>> getQuiz() {
		
		List<Quiz1> quiz1 = new ArrayList<Quiz1>();
		
		quizRepo.findAll().forEach(quiz1::add);
		
		return new ResponseEntity<>(quiz1, HttpStatus.OK);
	  }

}
