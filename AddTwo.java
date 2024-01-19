/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		
		// get an input of 2 integers
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		// prints them as an equation
		System.out.println(a + " + " + b + " = " + (a+b));	
	}
}
