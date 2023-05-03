import java.util.Arrays;

/**
 *         A simple class that contains many common methods used for performing
 *         various computations. These methods may or may not be correct. We
 *         should add a test class to check the validity of these methods.
 *         @author bbabai00
 */
public class Calculator {

	/**
	 * a function that takes two integer numbers and 
	 * returns the remainder from dividing the first number by the second one
	 * @param a a integer number
	 * @param b a integer number
	 * @return the remainder from dividing a by b
	 * @author bbabai00
	 */
	public static int remainder(int a, int b) {
		return a % b;
	}

	/**
	 * a function that takes two double numbers and 
	 * returns their addition
	 * @param a a double number
	 * @param b a double number
	 * @return the addition of the two inputed numbers
	 * @author bbabai00
	 */
	public static double add(double a, double b) {
		return a + b;
	}

	/**
	 * a function that takes two double numbers and
	 * returns their multiplication
	 * @param a a double number
	 * @param b a double number
	 * @return the multiplication of the two numbers
	 * @author bbabai00
	 */
	public static double multiply(double a, double b) {
		if(a==0 && b<0 || b==0 && a<0) {
			return 0;
		}
		return a * b;
	}

	/**
	 * a function that takes two double numbers and
	 * returns the first number subtracted by the second one
	 * @param a a double number
	 * @param b a double number
	 * @return the first number subtracted by the second one
	 * @author bbabai00
	 */
	public static double subtract(double a, double b) {
		return a - b;
	}

	/**
	 * a function that takes two double numbers and 
	 * returns their division
	 * @param a a double number
	 * @param b a double number
	 * @return the first number divided by the second one
	 * @author bbabai00
	 */
	public static double divide(double a, double b) {
		if(a==0 && b<0) {
			return 0;
		}
		return a / b;
	}

	/**
	 * a function that takes in a list of double numbers and 
	 * returns their average
	 * @param values a list of double numbers
	 * @return the average of the inputed numbers
	 * @author bbabai00
	 */
	public static int average(double... values) {
		int sum = 0;
		if(values != null && values.length > 0) {
			for (double n : values) {
				sum += n;
			}
		}
		return sum / values.length;
	}

	/**
	 * Calculates the standard deviation of the list of numbers
	 * @param values a list of double numbers
	 * @return the standard deviation of the list of numbers
	 * @author bbabai00
	 */
	public static double standardDeviation(double... values) {
		double average = average(values);
		double meanSquaredDiff = 0;
		if(values != null && values.length > 0) {
			for (double n : values) {
				meanSquaredDiff += Math.pow((n - average), 2);
			}
			return Math.sqrt(meanSquaredDiff / (values.length));
		}
		else 
			return 0;
		
	}

	// calculate arithmetic median
	// the median of a finite list of numbers can be found
	// by arranging all the numbers from smallest to greatest.
	// If there is an odd number of numbers, the middle one is
	// picked. If there is an even number of observations, then
	// there is no single middle value; the median is then usually
	// defined to be the mean of the two middle values
	/**
	 * a function that takes in a list of double numbers and
	 * returns their arithmetic median
	 * @param values a list of double numbers
	 * @return the arithmetic median of the list of numbers 
	 * @author bbabai00
	 */
	public static double median(double... values) {
		Arrays.sort(values);
		if(values == null || values.length <= 0) {
			return 0;
		}
		if(values.length % 2 == 1) {
			return values[values.length / 2];
		} else {
			return (values[(values.length / 2) - 1] + values[values.length / 2]) / 2;
		}
		
	}

	/**
	 * a function that takes in a list of double numbers and
	 * returns the biggest number inside the list
	 * @param values a list of double numbers
	 * @return the biggest number inside the list
	 * @author bbabai00
	 */
	public static double max(double... values) {
		double max = 0;
		if (values.length > 0 && values != null) {
			max = values[0];
			for (int i = 1; i < values.length; i++) {
				if (values[i] > max) {
					max = values[i];
				}
			}
		}
		return max;
	}

	/**
	 * a function that takes in a list of double numbers and
	 * returns the smallest number inside the list
	 * @param values a list of double numbers
	 * @return the smallest number inside the list
	 * @author bbabai00
	 */
	public static double min(double... values) {
		double min = 0;
		if (values.length > 0 && values != null) {
			min = values[0];
			for (int i = 1; i < values.length; i++) {
				if (values[i] < min) {
					min = values[i];
				}
			}
		}
		return min;
	}

}
