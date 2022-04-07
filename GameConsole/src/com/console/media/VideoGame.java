package com.console.media;

import java.util.ArrayList;

import com.console.store.Store;

public class VideoGame extends Media {
	
	public String publisher;
	public boolean onlineRequired;
	public int playerNumber;
	
	public VideoGame() {
		super();
	}
	
	public VideoGame(String title, double price, String mediaType, String genre, int yearReleased, String publisher,
			boolean onlineRequired, int playerNumber) {
		super(title, price, mediaType, genre, yearReleased);
		this.publisher = publisher;
		this.onlineRequired = onlineRequired;
		this.playerNumber = playerNumber;
	}
	
	Store store = new Store();
	ArrayList<VideoGame> gameList = store.getGameStore();
			
	public void displayStore() {
		System.out.println("\nSelect a game or type \"exit\"");
		
		for(int i = 0; i <= gameList.size() - 1; i++) {
			System.out.println(i + 1 + " : " + gameList.get(i));
		}
		
	}
	
}
