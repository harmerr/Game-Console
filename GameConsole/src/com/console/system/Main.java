package com.console.system;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("System booting up...\n");
		System.out.print("Welcome to the Media System");
		
		while(true) {
			System.out.println("\nPlease make a selection: [Store] [Local Media] [Apps]");
			
			String userInput = sc.nextLine().toLowerCase();
			
			switch (userInput) {
			case "store": Methods.launchStore();
				break;
			case "local Media": // launchMedia
				break;
			case "apps": // launchApps();
				break;
			}
			
		}
		
	}
}
