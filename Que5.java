/*.Write a program to split a string containing two words using StringTokenizer without using hasMoreTokens() 
 * method and call nextToken() method three times.Add an exception handling block if necessary.*/


package Assignment7;
import java.util.StringTokenizer;
public class Que5 {

	public static void main(String[] args) {
		try {
			String str="Good morning!!!";
			StringTokenizer tokenizer=new StringTokenizer(str);
          
			System.out.println("Token 1: "+ tokenizer.nextToken());
			System.out.println("Token 2: "+ tokenizer.nextToken());
			
			 System.out.println("Token 3: " + tokenizer.nextToken());
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
		
	}

}
