package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	private static int nextTruckID = 1000;
	private int truckID, truckRating;
	private String truckName, foodType;
	
	public FoodTruck() {
		
	}
	
	public FoodTruck(String truckName, String foodType, int truckRating) {
		this.truckID = nextTruckID;
		nextTruckID++;
		this.truckName = truckName;
		this.foodType = foodType;
		this.truckRating = truckRating;
	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public int getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(int truckRating) {
		this.truckRating = truckRating;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return "ID #" + truckID + " Name: " + truckName + " Cuisine: " + foodType + " Rating " + truckRating + " out of 5 Stars.";
	}
	
	
	

}
