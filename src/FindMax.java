/**
 * 
 * @author alexanderstassis
 *	Basic test class for github tutorial
 *	To find the maximum number in an Integer array
 */
public class FindMax {

	// maxValue method which returns max value of an array
	public static int maxValue (int[] x){

		int max = x[0];

		for(int i=1; i < x.length; i++){
			if(x[i] > max){
				max = x[i];
			}
		}
		return max;
	}

	public static void main (String[] args){
		
		// Declaring array 
		int[] x = {8, 4, 12, 90, 5, 6, 19, 25};
		int y = maxValue(x);

		// Simple printout to the console
		System.out.println("The maximum value of the x array is: " + y);

	}
}
