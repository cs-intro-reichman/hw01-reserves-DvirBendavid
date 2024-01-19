/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		
		// get an input of the numbers range and save the range in an int
		int lowerbound = Integer.parseInt(args[0]);
		int upperbound = Integer.parseInt(args[1]);
		int range = (upperbound - lowerbound);
		
		//generates 3 randon numbers in the defined range 
		int rand1 = (int)((Math.random()* range)+ lowerbound);  
		int rand2 = (int)((Math.random()* range)+ lowerbound);  
		int rand3 = (int)((Math.random()* range)+ lowerbound); 

		//calculate the minimal number out of the randoms 
		int minimal = Math.min(Math.min(rand1,rand2), rand3);
		
		// prints the randoms and the minimal one 
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("The minimal generated number was " + minimal);
	}
}
