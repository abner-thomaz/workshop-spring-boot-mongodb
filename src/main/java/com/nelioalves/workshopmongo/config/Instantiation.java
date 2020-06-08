package com.nelioalves.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userReposiroty;


	@Override
	public void run(String... arg0) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userReposiroty.deleteAll();
		
	
		User carita = new User(null, "Carita Thomaz", "carita@gmail.com");
		User abner = new User(null, "Abner Thomaz", "abner@gmail.com");
		User timoteo = new User(null, "Timoteo Thomaz", "timoteo@gmail.com");
		
		userReposiroty.saveAll(Arrays.asList(carita, abner, timoteo));

	}
	

}

