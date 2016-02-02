/**
 * 
 * @author jonathanbones
 *	Basic test class for github tutorial
 */
public class InterestCalculator {
	
		public static void main(String[] arguments){
			
			int investment = 0;
			
			if(arguments.length > 0)
				investment = Integer.parseInt(arguments[0]);
			
			
			System.out.println("Investment amount is: "+ investment);
			//Calculate the worth after a year of with interest at 6%
			investment *= 1.06;
			//Calculate the worth after a year with interest at 8%
			investment *= 1.08;
			//Calculate the worth after a year with interest at 10%
			investment *= 1.1;
			//Print out the final worth to the display
			System.out.println("Investment worth after three years is: "+investment);
		}
}
