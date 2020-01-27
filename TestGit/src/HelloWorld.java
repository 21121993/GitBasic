
/**
 * @author SISHANK
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcFeetAndInchesToCenti(13, 1));
		System.out.println(calcFeetAndInchesToCenti(100));

	}

	public static double calcFeetAndInchesToCenti(double feet, double inches) {
		if (feet >= 0 && (inches >= 0 && inches <= 12)) {
			return ((feet * 30.48) + (inches * 2.54));
		} else {
			return -1;
		}

	}

	public static double calcFeetAndInchesToCenti(double inches) {
		if (inches >= 0) {
			System.out.println((int)(inches / 12) + "  " + inches % 12);
			return calcFeetAndInchesToCenti(inches / 12, inches % 12);
		}
		return -1;
	}

}
