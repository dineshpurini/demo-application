package com.demoapplication.demoapplication;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayMovieList {
	
	@RequestMapping("/movies")
	public List<Movies> getMovieList(){
		return Arrays.asList(new Movies("Shawshank Redemption","Frank Darabont","1993"));
	}
}
