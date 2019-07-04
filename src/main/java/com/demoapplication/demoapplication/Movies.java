package com.demoapplication.demoapplication;

public class Movies {	
	private String movieName;
	private String director;
	private String yearOfRelease;
	public Movies(String movieName, String director, String yearOfRelease) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getDirector() {
		return director;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
		
}
