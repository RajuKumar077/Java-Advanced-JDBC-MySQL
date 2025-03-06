package packageDay5;

import java.util.Scanner;

public class TicketingSystem {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Get the number of tickets
		System.out.print("Enter the number of tickets You want: ");
		int tickets = scanner.nextInt();

		for (int i = 1; i <= tickets; i++) {

			// Get age for each ticket
			System.out.print("Enter the age for ticket " + i + ": ");
			int age = scanner.nextInt();

			// Based on age - ticket cost
			if (age >= 0 && age <= 5) {
				
				System.out.println("  for "+age+" it is Child so Free ticket.");

			} else if (age > 5 && age <= 15) {
				
				System.out.println("  for "+age+" it is Child: Half ticket price (250).");

			} else if (age > 15 && age < 58) {
				
				System.out.println("  for "+age+" it is Adult: Full ticket price (500).");

			} else if (age >= 58) {
				
				System.out.println("  for "+age+" it is Senior Citizen: 10% Discounted ticket price (450).");

			} else {
				System.out.println("  Age is not valid");
			}
			
			
		}
		
		System.out.println("Please Visit Again");
		scanner.close();


	}
}
