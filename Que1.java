

/*1.Write a program to calculate the square value of any number given by the user .
 * Add an exception handling block to check whether the user enter letters instead of numbers*/


package Assignment7;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num1 = sc.nextInt();
			double square = num1 * num1;
			System.out.println("Square of entered number is:" + square);
		} catch (InputMismatchException e) {
			System.out.println("Error: Entered number is not number");
		}

	}
}
