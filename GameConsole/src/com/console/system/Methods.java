package com.console.system;

import java.util.Scanner;
import com.console.media.VideoGame;

public class Methods {

	static VideoGame gameStore = new VideoGame();
	
	static Scanner input = new Scanner(System.in);
	
	public static void launchStore() {
		System.out.println("\nWelcome to the System Store");
		
		System.out.println("\nPlease make a selection: [Games] [Music] [Applications] [Weekly Deals] [Account]");
		
		String storeInput = input.nextLine().toLowerCase();
		
		switch(storeInput) {
		case "games":
			gameStore.displayStore();
			break;
		case "music": 
			break;
		case "applications": 
			break;
		case "weekly deals": 
			break;
		case "account": 
			break;
		}
		
	}
}
