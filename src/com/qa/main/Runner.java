package com.qa.main;

public class Runner {

	public static void main(String[] args) {

		Car tesla = new Car("black", "cybertruck", 1000);
		RacingDriver ayrtonsenna = new RacingDriver();
		Mechanic bob = new Mechanic();
		
		ayrtonsenna.setMilesDriven(500);
		ayrtonsenna.drive(tesla);

		System.out.println(tesla.getMileage());
		
		bob.checkMiles(tesla);
		bob.doCheckup(tesla);
		
	}

}
