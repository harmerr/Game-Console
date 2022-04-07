package com.console.media;

public abstract class Media {

	public String title;
	public double price;
	public String mediaType;
	public String genre;
	public int yearReleased;
	
	public Media() {
		super();
	}
	
	public Media(String title) {
		this.title = "Store";
	}
	
	public Media(String title, double price, String mediaType, String genre, int yearReleased) {
		this.title = title;
		this.price = price;
		this.mediaType = mediaType;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	
	public abstract void displayStore();
}
