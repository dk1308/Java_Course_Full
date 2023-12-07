import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Manage {
	private static final Scanner sc = new Scanner(System.in);

	private static final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";
	private static final char[] chars = { '1', 'A', 'a', 'B', 'b', 'C', 'c', '2', 'D', 'd', 'E', 'e', 'F', 'f', '3',
			'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', '4', 'M', 'm', 'N', 'n', 'O', 'o', '5', 'P',
			'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', '6', '7', 'U', 'u', 'V', 'v', 'U', 'u', 'W', 'w', '8', 'X',
			'x', 'Y', 'y', 'Z', 'z', '9' };

	public int checkInputIntLimit(int min, int max, Locale language) {
		while (true) {
			try {
				int result = Integer.parseInt(sc.nextLine());
				if (result < min || result > max) {
					throw new NumberFormatException();
				}
				return result;
			} catch (NumberFormatException ex) {
				getWordLanguage(language, "errCheckInputIntLimit");
				System.out.println();
			}
		}
	}

	public String checkInputString(Locale language) {
		while (true) {
			String result = sc.nextLine();
			if (result.length() == 0) {
				getWordLanguage(language, "errCheckNotBlank");
				System.out.println();
			} else {
				return result;
			}
		}
	}

	public int checkInputAccount(Locale language) {
		while (true) {
			getWordLanguage(language, "enterAccountNumber");
			String result = sc.nextLine();
			if (result.matches(ACCOUNT_NUMBER_VALID)) {
				return Integer.parseInt(result);
			}
			getWordLanguage(language, "errCheckInputAccount");
			System.out.println();
		}
	}

	

	public String checkInputPassword(Locale language) {
		String password="";
		while (true) {
			getWordLanguage(language, "enterPassword");
			password = checkInputString(language);
			int lengthPassword = password.length();
			if (lengthPassword < 8 || lengthPassword > 31) {
				getWordLanguage(language, "errCheckLengthPassword");
				System.out.println();
				continue;
			} else {
				int countDigit = 0;
				int countLetter = 0;
				for (int i = 0; i < lengthPassword; i++) {
					if (Character.isDigit(password.charAt(i))) {
						countDigit++;
					} else if (Character.isLetter(password.charAt(i))) {
						countLetter++;
					}
				}
				if (countDigit < 1 || countLetter < 1) {
					getWordLanguage(language, "errCheckAlphanumericPassword");
					System.out.println();
					continue;
				}
			}
			return password;
		}
	}

	public boolean checkInputCaptcha(String captchaGenerated, Locale language) {
		System.out.println(captchaGenerated);
		getWordLanguage(language, "enterCaptcha");
		String captchaInput = checkInputString(language);
		for (int i = 0; i < captchaInput.length(); i++) {
			if (!captchaGenerated.contains(Character.toString(captchaInput.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public String generateCaptchaText() {
		final int LENGTH = 6;
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for (int i = 0; i < LENGTH; i++) {
			index = (int) (Math.random() * (chars.length - 1));
			sb.append(chars[index]);
		}
		return sb.toString();
	}

	public void getWordLanguage(Locale curLocate, String key) {
		ResourceBundle words = ResourceBundle.getBundle("Language/"+curLocate,curLocate);
		String value = words.getString(key);
		System.out.printf(value);
	}

	public void login(Locale language) {
		int accountNumber = checkInputAccount(language);
		String passString = checkInputPassword(language);
		
		while (true) {
			String captchaGenerated = generateCaptchaText();
			if (checkInputCaptcha(captchaGenerated, language)) {
				getWordLanguage(language, "loginSuccess");
				System.out.println();
				return;
			} else {
				getWordLanguage(language, "errCaptchaIncorrect");
				System.out.println();
			}
		}
	}

	public void display() {
		Locale vietnamese = new Locale("vi");
		Locale english = new Locale("en");
		System.out.println("1. Vietnamese");
		System.out.println("2. English");
		System.out.println("3. Exit");
		System.out.print("Please choice one option: ");
		int choice = checkInputIntLimit(1, 3, english);
		switch (choice) {
		case 1:
			login(vietnamese);
			break;
		case 2:
			login(english);
			break;
		case 3:
			return;
		}
	}
}
