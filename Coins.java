/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		
		//get an input of the cents quantity
		int totalcoins = Integer.parseInt(args[0]);
		
		//calculates the quarters and cents remainder
		int quarters = totalcoins / 25;
		int cents = totalcoins % 25;
		
		// prints the quarters and cents remainder 
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}