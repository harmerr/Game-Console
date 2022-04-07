package com.console.media;

public class Video extends Media {

	public String studio;
	public String director;
	public int duration;
	
	public Video() {
		super();
	}
	
	public Video(String title, double price, String mediaType, String genre, int yearReleased, String studio,
			String director, int duration) {
		super(title, price, mediaType, genre, yearReleased);
		this.studio = studio;
		this.director = director;
		this.duration = duration;
	}
	
	public void displayStore() {
		
	}
}
