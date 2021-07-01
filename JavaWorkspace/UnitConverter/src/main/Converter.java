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
				System.out.println("Enter the number of cups that you would like to convert to teaspoons:");
				int cups = input.nextInt();
				int tsp = cups*48;
				System.out.println(cups+" cups is equivalent to "+tsp+" teaspoons.");
				break;
			case 2:
				System.out.println("Enter the number of miles that you would like to convert to kilometers:");
				double mi = input.nextDouble();
				double km = mi*1.609;
				System.out.println(mi+" miles is equivalent to "+km+" kilometers.");
				break;
			case 3:
//				usGal_to_impGal
				System.out.println("Enter the number of US gallons that you would like to convert to Imperial gallons:");
				double usgal = input.nextDouble();
				double impgal = usgal*0.8327;
				System.out.println(usgal+" US gallons is equivalent to "+impgal+" Imperial gallons.");
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
