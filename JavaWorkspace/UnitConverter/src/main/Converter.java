package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menuSelection = 0;
		Converter cn = new Converter(); 
		while(menuSelection != 4) {
			System.out.println("Please select an option:\n1. Cups to Teaspoons\n2. Miles to Kilometers\n3. US Gallons to Imperial Gallons\n4. Quit");
			menuSelection = input.nextInt();
			switch(menuSelection) {
			case 1:
//				cups_to_tsp
				double cups = collectQuantity("cups", "teaspoons");
				double tsp = cn.cups_to_tsp(cups);
				System.out.println(cups+" cups is equivalent to "+tsp+" teaspoons.");
				break;
			case 2:
//				mi_to_km
				double mi = collectQuantity("miles", "kilometers");
				double km = cn.mi_to_km(mi);
				System.out.println(mi+" miles is equivalent to "+km+" kilometers.");
				break;
			case 3:
//				usGal_to_impGal
				double usgal = collectQuantity("US gallons", "Imperial Gallons");
				double impgal = cn.usGal_to_impGal(usgal);
				System.out.println(usgal+" US gallons is equivalent to "+impgal+" Imperial gallons.");
				break;
			case 4:
				break;
			default:
				System.out.println("Please select a number between 1 and 4.");
				break;
			}
		}
		input.close();
	}

	private static double collectQuantity(String unit1, String unit2) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of "+unit1+" that you would like to convert to "+unit2+":");
		double inUnit = input.nextDouble();
		input.close();
		return inUnit;
	}
	public double cups_to_tsp(double qty) {
		double tsp = qty*48;
		return tsp;
	}
	public double mi_to_km(double qty) {
		double km = qty*1.609;
		return km;
	}
	public double usGal_to_impGal(double qty) {
		double impgal = qty*0.8327;
		return impgal;
	}
}
