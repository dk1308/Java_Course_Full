
import java.util.ArrayList;
import java.util.Calendar;

public class Manager {
	public static int menu() {
		System.out.println("======================Candidates Of Company=========================");
		System.out.println("(1) Experience");
		System.out.println("(2) Fresher");
		System.out.println("(3) Internship");
		System.out.println("(4) Search");
		System.out.println("(5) Exit");
		
		int choice = Validation.checkInputIntLimit(1, 5);
		return choice;
	}

	// allow user input information common of candidate
	public static void createCandidate(ArrayList<Candidate> candidates, int type) {
		// loop until user don't want to create new candidate
		while (true) {
			System.out.print("Enter id: ");
			String id = Validation.checkInputString();
			System.out.print("Enter first name: ");
			String firstName = Validation.checkInputString();
			System.out.print("Enter last name: ");
			String lastName = Validation.checkInputString();
			System.out.print("Enter birth date: ");
			int birthDate = Validation.checkInputIntLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
			System.out.print("Enter address: ");
			String address = Validation.checkInputString();
			System.out.print("Enter phone: ");
			String phone = Validation.checkInputPhone();
			System.out.print("Enter email: ");
			String email = Validation.checkInputEmail();
			Candidate candidate = new Candidate(id, firstName, lastName, birthDate, address, phone, email, type);
			// check id exist or not
			if (Validation.checkIdExist(candidates, id)) {
				switch (type) {
				case 0:
					createExperience(candidates, candidate);
					break;
				case 1:
					createFresher(candidates, candidate);
					break;
				case 2:
					createInternship(candidates, candidate);
					break;
				}
			} else {
				return;
			}
			System.out.print("Do you want to continue (yY/nN): ");
			// check user want to create new candidate or not
			if (!Validation.checkInputYN()) {
				return;
			}
		}
	}

	public static void createExperience(ArrayList<Candidate> candidates, Candidate candidate) {
		System.out.print("Enter year of experience");
		int yearExperience = Validation.checkInputExperience(candidate.getBirthDate());
		System.out.print("Enter type of proskill");
		String professionalSkill = Validation.checkInputString();
		candidates.add(new Experience(candidate.getId(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
				candidate.getTypeCandidate()));
		System.out.println("Creat success.");

	}

	public static void createFresher(ArrayList<Candidate> candidates, Candidate candidate) {
		System.out.println("Enter Graduation Rank: ");
		String graduationRank = Validation.checkInputGraduationRank();
		System.out.println("Enter Graduation Time: ");
		String graduationDate = Validation.checkInputString();
		candidates.add(new Fresher(graduationDate, graduationRank, candidate.getId(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
				candidate.getTypeCandidate()));
		System.out.println("Creat success.");
	}

	public static void createInternship(ArrayList<Candidate> candidates, Candidate candidate) {
		System.out.println("Enter Major: ");
		String maJor = Validation.checkInputString();
		System.out.println("Enter Semester: ");
		String semester = Validation.checkInputString();
		System.out.println("Enter University name: ");
		String universityName = Validation.checkInputString();
		candidates.add(new Internship(maJor, semester, universityName, candidate.getId(), candidate.getFirstName(),
				candidate.getLastName(), candidate.getAddress(), candidate.getPhone(), candidate.getEmail(),
				candidate.getTypeCandidate()));
		System.out.println("Creat success.");
	}

	public static void searchCandidate(ArrayList<Candidate> candidates) {

	}
}
