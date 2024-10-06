package Assignment7;

/*2.Create an integer array of size n and read the elements from the user .
Add an exception handling block to print the value at nth position of the array*/

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Get the size of the array from the user
			System.out.print("Enter the size of the array: ");
			int n = sc.nextInt();
			if (n <= 0) {
				throw new IllegalArgumentException("Size must be a positive integer.");
			}

			int[] array = new int[n];

			// Read elements from the user
			for (int i = 0; i < n; i++) {
				System.out.print("Enter element " + (i + 1) + ": ");
				array[i] = sc.nextInt();
			}

			// Get the position to access
			System.out.print("Enter the position (0 to " + (n - 1) + ") to access: ");
			int position = sc.nextInt();

			// Access the element at the specified position
			System.out.println("Element at position " + position + ": " + array[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: The position entered is out of bounds.");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}

	}
}
