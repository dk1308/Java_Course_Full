
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import Exception.ValidDateException;

public class Main {
	public static void main(String[] args) throws ValidDateException {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		Input inputter = new Input();
		CandidateManagement candManage = new CandidateManagement();
		ArrayList<Candidates> listNewCand = new ArrayList<>();
		int choice;

		do {
			System.out.println();
			System.out.println("MENU ---------- ");
			System.out.println("1. Experience Candidate ");
			System.out.println("2. Fresher Candidate ");
			System.out.println("3. Intern	 Candidate ");
			System.out.println("4. Searching ");
			System.out.println("5. Exit ");
			System.out.println("Nhập lựa chọn của bạn: ");
			choice = sc.nextInt();

			if (choice == 3 || choice == 1 || choice == 2) {
				if (choice == 1) {
					listNewCand.add(candManage.createNewCandidate(0));
					String ans;
					do {
						ans = inputter.inputGeneral("Bạn muốn tiếp tục (Y/N)?").toUpperCase();
						if (ans.equals("Y")) {
							listNewCand.add(candManage.createNewCandidate(0));
						} else {
							for (Candidates candidates : listNewCand) {
								System.out.println(candidates);
							}
						}
					} while (ans.equals("Y"));
				} else if (choice == 2) {
					listNewCand.add(candManage.createNewCandidate(1));
					String ans;
					do {
						ans = inputter.inputGeneral("Bạn muốn tiếp tục (Y/N)?").toUpperCase();
						if (ans.equals("Y")) {
							listNewCand.add(candManage.createNewCandidate(1));
						} else {
							for (Candidates candidates : listNewCand) {
								System.out.println(candidates);
							}
						}
					} while (ans.equals("Y"));
				} else {
					listNewCand.add(candManage.createNewCandidate(2));
					String ans;
					do {
						ans = inputter.inputGeneral("Bạn muốn tiếp tục (Y/N)?").toUpperCase();
						if (ans.equals("Y")) {
							listNewCand.add(candManage.createNewCandidate(2));
						} else {
							for (Candidates candidates : listNewCand) {
								System.out.println(candidates);
							}
						}
					} while (ans.equals("Y"));
				}

			} else if (choice == 4) {
				candManage.displayAllCand();
				System.out.println();
				Candidates cand = candManage.searchCand();
				if (cand.getCandType() == 0) {
					candManage.displayEachCand((ExperienceCand) cand);
				} else if (cand.getCandType() == 1) {
					candManage.displayEachCand((FresherCand) cand);
				} else if (cand.getCandType() == 2) {
					candManage.displayEachCand((InternCand) cand);
				}
			}
//			switch (choice) {
//			case 0: {
//				listNewCand.add(candManage.createNewCandidate());
//				String ans;
//				do {
//					ans = inputter.inputGeneral("Bạn muốn tiếp tục (Y/N)?").toUpperCase();
//					if (ans.equals("Y")) {
//						listNewCand.add(candManage.createNewCandidate());
//					} else {
//						for (Candidates candidates : listNewCand) {
//							System.out.println(candidates);
//						}
//					}
//				} while (ans.equals("Y"));
//				
//				break;
//			}
//			case 1: {
//				FresherCand freshCand = (FresherCand) candManage.createNewCandidate();
//				break;
//			}
//			case 2: {
//				InternCand internCand = (InternCand) candManage.createNewCandidate();
//				break;
//			}
//			case 3: {
//				candManage.displayAllCand();
//				System.out.println();
//				Candidates cand = candManage.searchCand();
//				if (cand.getCandType() == 0) {
//					candManage.displayEachCand((ExperienceCand)cand);
//				} else if (cand.getCandType() == 1) {
//					candManage.displayEachCand((FresherCand)cand);
//				} else if (cand.getCandType() == 2) {
//					candManage.displayEachCand((InternCand)cand);
//				}
//				break;
//			}
//			default:
//				throw new IllegalArgumentException("Unexpected value: " + choice);
//			}

		} while (choice > 0 && choice < 5);

	}

}
