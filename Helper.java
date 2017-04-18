
/**
 * Helper functions
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Helper {
	/*
	 * Convert a fahrenheit to celsius
	 */

	public static double FahrenheitToCelsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32) * 5) / 9;
		return celsius;

	}

	/*
	 * Returns below freezing is the temperature is below freezing and above
	 * freezing if temperature is above freezing. If exactly at freezing return
	 * at freezing.
	 */
	public static String isFreezing(double temperature_in_fahrenheit) {
		if (temperature_in_fahrenheit == 32) {

			return "at freezing";
		}
		if (temperature_in_fahrenheit > 32) {

			return "above freezing";
		} else
			return "below freezing";
	}

	/*
	 * Find the smallest number that is divisible by both n1 and n2
	 */
	public static int SmallestNumberDivisibleBy(int n1, int n2) {

		if ((n1 * n2) % 2 == 0) {

			return (n1 * n2) / 2;
		}

		else
			return n1 * n2;
	}

	/*
	 * Find the range of the array. The range is the difference between the
	 * biggest and the smallest value in the array.
	 */
	public static double FindRange(double[] values) {

		double largest = values[0];
		double smallest = values[0];
		
		for(int i = 1; i < values.length; i++){
		if(values[i] > largest)
			largest = values[i];
		
		else if(values[i] < smallest)
			smallest = values[i];
		

		}
			
			return largest - smallest;
		}

	/*
	 * Calculate the sum of the first n numbers
	 */
	static int SumFrom0(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++)
			sum += (i+1);
		return sum;
	}

	/*
	 * Calculate the sum of the first n numbers of n1, n2 and n3. Then, return
	 * their sum. Use the function sumFrom0 defined above.
	 */
	public static int SumofSumFrom0(int n1, int n2, int n3) {
		
		return SumFrom0(n1) + SumFrom0(n2) + SumFrom0(n3);
		
	}
	
    /*
     * Generate a random number between min and max with the
     * possibility of values at min and max included
     */
    public static int generateRandom(int min, int max)
    {
    	
    	
    	return 0;
    }
    
    /*
     * Create an array of integers. The array should have
     * integers starting at start and then ending at end.
     * You will have to make the array long each to accomodate
     * that.
     */
    public static int[] createArrayWithConsecutiveNumbers(int start, int end)
    {
    	return null;
    }
}
