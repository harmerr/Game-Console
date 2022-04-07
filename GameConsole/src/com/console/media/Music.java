package com.console.media;

public class Music extends Media {

	public String artist;
	public String album;
	public String genre;
	public int duration;
	
	public Music(String title, double price, String mediaType, String genre, int yearReleased, String artist, String album, 
			int duration) {
		super(title, price, mediaType, genre, yearReleased);
		this.artist = artist;
		this.album = album;
		this.duration = duration;
	}

}
