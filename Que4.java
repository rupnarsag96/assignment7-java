/*4.Write a program to read a string and convert to integer using try catch block*/

package Assignment7;
import java.util.Scanner;
public class Que4 {

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=sc.next();
			System.out.println("string is :"+Integer.parseInt(str));
		} catch (NumberFormatException e){
			System.out.println("Error: entered string is not numbered string");
		}
		
		
		

	}

}
