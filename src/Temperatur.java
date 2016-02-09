
public class Temperatur {

	public static void main(String[] args) {

		// Übung (#3)

		double celsius = 25;
		double result = celsius2Fahrenheit(celsius);

		System.out.println(celsius + " Grad Celsius sind " + result + " Grad Fahrenheit");

	}

	public static double celsius2Fahrenheit(double celsius) {

		double result = ((9.0 / 5.0) * celsius + 32);

		return result;

	}

}