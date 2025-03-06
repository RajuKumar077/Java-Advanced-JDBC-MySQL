package packageDay4;


public class Encapsulation {

	// Car class with encapsulation
	static class Car {

		// Private fields
		private String model;
		private int year;

		// Constructor
		public Car(String model, int year) {
			this.model = model;
			this.year = year;
		}

		// Getter for model
		public String getModel() {
			return model;
		}

		// Setter for model
		public void setModel(String model) {
			this.model = model;
		}

		// Getter for year
		public int getYear() {
			return year;
		}

		// Setter for year
		public void setYear(int year) {
			this.year = year;
		}

		// Method to display car info
		public void displayInfo() {
			System.out.println("Model: " + model + ", Year: " + year);
		}
	}

	public static void main(String[] args) {
		// Create a Car object
		Car myCar = new Car("Toyota", 2020);

		// Display car info
		myCar.displayInfo();

		// Update car details
		myCar.setModel("Honda");
		myCar.setYear(2022);

		// Display updated car info
		myCar.displayInfo();
	}
}
