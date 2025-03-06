package packageDay4;

//Car.java
public class Car implements InterfaceCar , InterfaceBike{
	
	private String model;
	private int year;
	
	

	// Constructor to initialize car details
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}

	// Implementing the displayInfo() method from ShowCar interface
	@Override
	public void displayInfoCar() {
		System.out.println("Car Model: " + model);
		System.out.println("Car Year: " + year);


	}
	
	public void displayInfoBike() {
		System.out.println("Bike Model: " + model);
		System.out.println("Bike Year: " + year);


	}
	
	public static void main(String[] args) {
		// Create a Car object
		Car myCar = new Car("Ford Mustang", 2022);
		Car myBike = new Car("BMW",2024);

		// Calling the displayInfo method to show car details
		myCar.displayInfoCar();
		System.out.println("\nNow Calling Bike interface \n");
		myBike.displayInfoBike();
	}
}