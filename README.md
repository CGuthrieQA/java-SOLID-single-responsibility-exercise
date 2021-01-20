# SOLID

## Single Responsibility

### Exercises

Try adding a Mechanic.java class to this setup.

```java
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

```

```java
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
```