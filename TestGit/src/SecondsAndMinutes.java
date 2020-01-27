/**
 * 
 */

/**
 * @author SISHANK
 ******
 **************/
public class SecondsAndMinutes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(60));
	}

	public static String getDurationString(int minutes, int seconds) {

		if (minutes < 0 || (seconds < 0 && seconds > 59)) {
			return "Invalid Value";
		}
		int hh = minutes / 60;
		int mm = minutes % 60 + seconds / 60;
		int ss = seconds % 60;

		return hh + " hh " + mm + " mm " + ss + " ss ";

	}

	public static String getDurationString(int seconds) {
		if (seconds < 0) {
			return "Invalid Vaule";
		}
		int mm = seconds / 60;
		int ss = seconds % 60;
		return getDurationString(mm, ss);
	}

	public static void main1(String[] args) {
		System.out.println("Hello Bro, are we cool");
	}
}
