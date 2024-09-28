package com.exemplo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class userResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L,"Douglas","doug@gmail.com","99999","123456");
	    return ResponseEntity.ok().body(u);
	}
}


