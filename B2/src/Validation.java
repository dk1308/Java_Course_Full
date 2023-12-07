
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Validation {
	private final static Scanner in = new Scanner(System.in);
	// \\d{10} user must be input 10 number
	private static final String phone_valid = "^\\d{10}";

	// valid email in java
	private static final String email_valid = "^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$";

	// check user input number limit
	public static int checkInputIntLimit(int min, int max) {
		// loop until user input correct
		while (true) {
			try {
				int result = Integer.parseInt(in.nextLine().trim());
				if (result < min || result > max) {
					throw new NumberFormatException();

				}
				return result;
			} catch (NumberFormatException e) {
				System.err.println("Please input number in rage [" + min + ", " + max + "]");
				System.out.print("Enter again: ");
			}
		}
	}

	// check user input char correct
	public static String checkInputString() {
		// loop until user input right
		String result = in.nextLine();
		if (result.isEmpty()) {
			System.out.print("Not empty");
			System.out.print("Enter again");
		} else {
			return result;
		}
		return result;

	}

	public static String checkInputPhone() {
		while (true) {
			String result = checkInputString();
			// check user input phone valid
			if (result.matches(phone_valid)) {
				return result;
			} else {
				System.err.println("Phone is number with minimum 10 characters");
				System.out.print("Enter again: ");
			}
		}
	}

	public static String checkInputEmail() {
		while (true) {
			String result = checkInputString();
			// chcek user input email valid
			if (result.matches(email_valid)) {
				return result;
			} else {
				System.err.println("Phone is number with minimum 10 characters");
				System.out.print("Enter again: ");
			}
		}

	}

// check Id hien huu~
	public static boolean checkIdExist(ArrayList<Candidate> candidates, String id) {
		for (Candidate candidate : candidates) {
			if (candidate.getId().equalsIgnoreCase(id)) {
				System.out.println("Id exist.");
				return false;
			}
		}
		return true;
	}

	// check input yes / no
	public static boolean checkInputYN() {
		while (true) {
			String result = checkInputString();
			if (result.equalsIgnoreCase("Y")) {
				return true;
			} else if (result.equalsIgnoreCase("N")) {
				return false;
			} else {
				System.out.println("Please input yY/nN");
				System.out.print("Enter again: ");
			}

		}
	}

	public static int checkInputExperience(int birthDate) {
		int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
		int age = yearCurrent - birthDate;
		while (true) {
			int yearExperience = checkInputIntLimit(1, 100);
			if (yearExperience > age) {
				System.err.println("Experience must be smaller than age");
			} else {
				return yearExperience;
			}
		}

	}

	public static String checkInputGraduationRank() {
		while(true) {
		String result = checkInputString();
		if (result.equalsIgnoreCase("Excellence") || result.equalsIgnoreCase(" Good") || result.equalsIgnoreCase("Fair")
				|| result.equalsIgnoreCase("Bad")) {
			return result;
		} else {
			System.out.println("Please input String: Excellence, Good, Fair, Bad");
			System.out.print("Enter again: ");
		}
		}

	}

}
