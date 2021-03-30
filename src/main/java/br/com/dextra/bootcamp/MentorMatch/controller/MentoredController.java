package br.com.dextra.bootcamp.MentorMatch.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dextra.bootcamp.MentorMatch.models.Mentor;
import io.swagger.annotations.Api;
import io.swagger.models.Response;

@Api
@RestController
@RequestMapping("api/v1/mentor")
public class MentoredController {
	
	public ResponseEntity<Long> create(@RequestBody Mentor mentor) {
		Mentor mentorResponse =  
	}

}
