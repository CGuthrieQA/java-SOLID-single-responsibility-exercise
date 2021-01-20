package com.qa.main;

public class Car {
	
	// the car should only be responsible for maintaining
	// its core attributes!
	private String colour;
	private String model;
	private int mileage;
	
	// constructor
	public Car( String colour, String model, int mileage ) {
		this.colour = colour;
		this.model = model;
		this.mileage = mileage;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
//	// functionality
//	public void drive(int milesDriven) {
//		this.setMileage( this.getMileage() + milesDriven );
//	}

}
