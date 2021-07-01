package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menuSelection = 0;
		while(menuSelection != 4) {
			System.out.println("Please select an option:\n1. Cups to Teaspoons\n2. Miles to Kilometers\n3. US Gallons to Imperial Gallons\n4. Quit");
			menuSelection = input.nextInt();
//			while(menuSelection < 1 || menuSelection > 4) {
//				System.out.println("Please select a number between 1 and 4.");
//				menuSelection = input.nextInt();
//			}
			switch(menuSelection) {
			case 1:
//				cups_to_tsp
				break;
			case 2:
//				mi_to_km
				break;
			case 3:
//				usGal_to_impGal
				break;
			case 4:
				break;
			default:
				System.out.println("Please select a number between 1 and 4.");
				break;
				
			}
		}
	}

}
