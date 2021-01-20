package com.qa.main;

public class Mechanic {
	
	public boolean checkup;
	
	public boolean isCheckup() {
		return checkup;
	}

	public void setCheckup(boolean checkup) {
		this.checkup = checkup;
	}
	
	public void checkMiles(Car car) {
		if (car.getMileage() > 1000 ) {
			this.setCheckup(true);
		} else {
			this.setCheckup(false);
		}
	}
	
	public void doCheckup(Car car) {
		System.out.println("car need checkup: " + this.checkup);
	}
	
}
