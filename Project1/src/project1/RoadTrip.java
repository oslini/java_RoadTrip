
/**
* Author: Angela Burns
* Programming Project 1
* September 26, 2018
* Calculates gallons of gas needed and number of stops for a road trip.
*/


package project1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RoadTrip {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat dFTG = new  DecimalFormat("0.0");
		DecimalFormat dFS = new  DecimalFormat("0");
		
		//DECLARE: Starting point
		String starting;
		System.out.print("Please enter the city you are leaving from: ");
		starting = scan.nextLine();
		//Capitalize the FIRST character
		String firstStarting; firstStarting = starting.substring(0,1);
		String capStarting; capStarting = firstStarting.toUpperCase();
		String lowerStarting; lowerStarting = starting.substring(1); lowerStarting = lowerStarting.toLowerCase();
		String startingPoint; startingPoint = capStarting + lowerStarting;
		
		//DECLARE: Destination
		String dest;
		System.out.print("Which city are you traveling to?: ");
		dest = scan.nextLine();
		//Capitalize the FIRST character
		String firstDest; firstDest = dest.substring(0,1);
		String capDest; capDest = firstDest.toUpperCase();
		String lowerDest; lowerDest = dest.substring(1); lowerDest = lowerDest.toLowerCase();
		String finalDest; finalDest = capDest + lowerDest;
	
		//DECLARE: Distance
		double miles;
		System.out.print("Enter the distance to be trsveled (in miles): ");
		miles = scan.nextDouble();
		
		//DECLARE: Car Mileage
		double mpg;
		System.out.print("How many miles-per-gallon of gas does the car get?: ");
		mpg = scan.nextDouble();
		
		//DECLARE: Car max gallons (tank holds)
		double maxGal;
		System.out.print("Lastly, what is the number of gallons the car's tank can hold?: ");
		maxGal = scan.nextDouble();
		
		//DECLARE required gas for trip
		double totalGal;
		totalGal = miles / mpg;
		
		//DECLARE: pit/refill stops
		double stop;
		stop = totalGal / maxGal; 
		
		//OUTPUT: println the Data
		System.out.println(" ");
		System.out.println("The trip from \"" + startingPoint + "\" to \"" + finalDest +
				"\", will require aproximitly: \"" + dFTG.format(totalGal) +  "\" gallons of gas.");
		System.out.println("Assuming, the trip is begun with a full thank of gas, "
				+ "then you would have to stop \"" + dFS.format(stop) + "\" times to refil.");

	}

}
