package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.*;

public class FoodTruckApp {

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();
		app.run();

	}

	public void run() {

		Scanner kb = new Scanner(System.in);
		FoodTruck[] foodTrucks = new FoodTruck[5];

		String name;
		int selection = 0;
		int i = 0;
		System.out.print("Please enter a truck name: ");
		name = kb.nextLine();
		do {
			System.out.print("What type of does this truck serve? ");
			String food = kb.nextLine();
			System.out.print("From 1 to 5 how do you rate this truck? ");
			int rating = kb.nextInt();
			kb.nextLine();
			foodTrucks[i] = new FoodTruck(name, food, rating);
			i++;
			System.out.print("Please enter a truck name or quit to continue: ");
			name = kb.nextLine();
		} while (!name.equals("quit"));

		do {
			menu2();
			selection = kb.nextInt();

			switch (selection) {
			case 1:
				displayFleet(foodTrucks);
				break;
			case 2:
				averageRating(foodTrucks);
				break;
			case 3:
				highestRating(foodTrucks);
				break;
			case 4:
				System.out.println("Good Bye");
				break;
			default:
				System.err.println( "**************************************\n" +
									"* Invalid selection please try again *\n" +
									"**************************************");
			}

		} while (selection != 4);

		kb.close();
	}

	public void menu2() {
		System.out.println("******************************************");
		System.out.println("* Choose one of the following by number: *");
		System.out.println("* 1. List All Trucks                     *");
		System.out.println("* 2. Average Rating                      *");
		System.out.println("* 3. Highest Rated Truck                 *");
		System.out.println("* 4. Quit                                *");
		System.out.println("******************************************");
	}

	public void displayFleet(FoodTruck[] trucks) {
		for (FoodTruck foodTruck : trucks) {
			if (foodTruck != null) {
				System.out.println(foodTruck);
			}
		}

	}

	public void averageRating(FoodTruck[] trucks) {
		int tallyRatings = 0;
		for (FoodTruck foodTruck : trucks) {
			if (foodTruck != null) {
				tallyRatings = tallyRatings + foodTruck.getTruckRating();
				double avgRatings = tallyRatings / trucks.length;
				System.out.println("The average food truck rating is: " + avgRatings);
			}
		}

	}

	public void highestRating(FoodTruck[] trucks) {
		int highestRating = 0;
		for (FoodTruck foodTruck : trucks) {
			if (highestRating < foodTruck.getTruckRating()) {
				highestRating = foodTruck.getTruckRating();
		}
			System.out.println("The Best Rated Truck is: " + highestRating + " Stars!");
		}

	}

}
