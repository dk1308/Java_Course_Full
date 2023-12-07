import java.util.Date;
import java.util.Scanner;

import Exception.ValidDateException;

public class Input {
	private Scanner sc = new Scanner(System.in);
	private Date currentD = new Date(System.currentTimeMillis());
	private int currentYear = currentD.getYear() + 1900;

	public String inputBirthDate(String text) throws ValidDateException {
		String birthDate;
		while (true) {
			try {
				System.out.println(text);
				birthDate = sc.nextLine();
				if (!validDate(birthDate))
					throw new ValidDateException("Valid date: 1900 - " + currentYear);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return birthDate;
	}

	public String inputPhone(String text) throws ValidDateException {
		String phone = null;
		do {
			try {
				System.out.println(text);
				phone = sc.nextLine();
				if (!phone.matches("[\\d]{10}")) {
					throw new ValidDateException("Valid phone: 0941990138 (10 digits)");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (!phone.matches("[\\d]{10}"));
		return phone;
	}

	public String inputEmail(String text) throws ValidDateException {
		String email = null;
		String emailPattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
		do {
			try {
				System.out.println(text);
				email = sc.nextLine();
				if (!email.matches(emailPattern)) {
					throw new ValidDateException("Valid email: khoanvdde170341@fpt.edu.vn");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} while (!email.matches(emailPattern));
		return email;
	}

	public int inputExpYear(String text) throws ValidDateException {
		int expYear = 0;
		do {
			try {
				System.out.println(text);
				expYear = sc.nextInt();
				if (expYear < 0 || expYear > 100)
					throw new ValidDateException("Valid experience year: 0<exp<100");
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		} while (expYear < 0 || expYear > 100);
		return expYear;
	}

	public String inputRank(String text) throws ValidDateException {
		String rank = null;
		while(true)
		{
			try {
				System.out.println(text);
				rank = sc.nextLine();
				sc.nextLine();
				if (rank.equalsIgnoreCase("Excellence") || rank.equalsIgnoreCase("Good")
						|| rank.equalsIgnoreCase("Fair") || rank.equalsIgnoreCase("Poor"))
					break;
				else
					throw new ValidDateException("Valid graduation rank: Excellence, Good, Fair, Poor");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rank;
	}

	public int inputCandType(String text) throws ValidDateException {
		int type = 0;
		do {
			try {
				System.out.println(text);
				type = sc.nextInt();
				if (type < 0 || type > 2) {
					throw new ValidDateException("Valid type: 0 <= type <= 2");
				}
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		} while (type < 0 || type > 2);
		return type;
	}

	public String inputGeneral(String text) {
		String object;
		do {
			System.out.println(text);
			object = sc.nextLine();
		} while (object.isBlank());
		return object;
	}

	public int inputInteger(String text, int min, int max) {
		int val;
		do {
			System.out.println(text);
			val = sc.nextInt();
		} while (val < min || val > max);
		return val;
	}

	public boolean validDate(String date) {
		int d = Integer.parseInt(date);
		if (date.matches("[\\d]{4}") && d >= 1900 && d <= currentYear) {
			return true;
		} else
			return false;
	}
}
