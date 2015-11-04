
public class Metropolis {

	public static void main(String[] args) {
		// Übung #4

		boolean isCapital = true;
		int inhabitants = 150_000;
		double taxPerPersonAndMonth = 1_000;

		boolean result = isMetropolis(isCapital, inhabitants, taxPerPersonAndMonth);
		System.out.println("Metropolis? " + result);

	}

	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {

		boolean resultA = isCapital && inhabitants > 100_000;

		double totalTaxes = inhabitants * taxPerPersonAndMonth * 12;

		boolean resultB = inhabitants > 200_000 && totalTaxes > 720_000;

		return resultA || resultB;

	}

}
