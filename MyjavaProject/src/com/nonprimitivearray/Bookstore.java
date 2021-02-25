package com.nonprimitivearray;

public class Bookstore {

	public static void main(String[] args) {
		Books[]Bookshelf= {new Books("HAWK EYE",1342,250),
				new Books("MAHABHARATHA SECRETS",13123,845),
				new Books("DEAD MEAT",131003,349),
				new Books("SILENT PATIENT",12000,159),
				new Books("DEATH RACE",114265,123)};
	for(Books x:Bookshelf) {
		x.details("Thriller");
	}
}}
