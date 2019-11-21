package com.arraylist;

public class Movie {
	String name;
	double rating;
	public Movie(String name, double rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + "]";
	}
	

}
