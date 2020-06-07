package com.nelioalves.workshopmongo.resources;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@RequestMapping(method =RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User carita = new User("1", "Carita Thomaz", "carita.thomaz@gmail.com");
		User abner = new User("2", "Abner Thomaz", "abner.thomaz@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(carita, abner));
		return ResponseEntity.ok().body(list);
		
	}

}
