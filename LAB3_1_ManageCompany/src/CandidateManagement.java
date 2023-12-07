import java.util.ArrayList;
import java.util.Scanner;

import Exception.ValidDateException;

public class CandidateManagement {
	ArrayList<Candidates> listCand = new ArrayList<>();
	private Input inputter = new Input();
	
	public Candidates createNewCandidate(int type) throws ValidDateException {
		String id = null;
		String name = null;
		String birthDate = null;
		String address = null;
		String phone = null;
		String email = null;
		int candType = type;
		id = inputter.inputGeneral("Nhập id ứng viên: ");
		
		name = inputter.inputGeneral("Tên: ");
		
		birthDate = inputter.inputBirthDate("Năm sinh: ");
		
		address = inputter.inputGeneral("Địa chỉ: ");
		
		phone = inputter.inputPhone("Số điện thoại: ");
		
		email = inputter.inputEmail("Email: ");
		
		switch (candType) {
		case 0: {
			int expYear=0;
			try {
				expYear = inputter.inputExpYear("Năm kinh nghiệm: ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String proSkill = inputter.inputGeneral("Chuyên môn: ");
			ExperienceCand expCand = new ExperienceCand(id, name, birthDate, address, phone, email, candType, expYear, proSkill);
			listCand.add(expCand);
			return expCand;
		}
		case 1: {
			int gradDate = inputter.inputInteger("Năm tốt nghiệp: ", 0, 2023);
			String gradRank= null;
			try {
				gradRank = inputter.inputRank("Xếp hạng tốt nghiệp: ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String uni = inputter.inputGeneral("Đại học: ");
			FresherCand freshCand = new FresherCand(id, name, birthDate, address, phone, email, candType, gradDate, gradRank, uni);
			listCand.add(freshCand);
			return freshCand;
		}
		case 2: {
			String major = inputter.inputGeneral("Chuyên ngành: ");
			String curSemester = inputter.inputGeneral("Kì học hiện tại: ");
			String uni = inputter.inputGeneral("Đại học: ");
			InternCand internCand = new InternCand(id, name, birthDate, address, phone, email, candType, major, curSemester, uni);
			listCand.add(internCand);
			return internCand;
		}
		default:
			break;
		}
		System.out.println("Thêm ứng viên thành công!");
		return null;
	}
	
	public void displayAllCand()
	{
		System.out.println("LIST OF CANDIDATES:");
		System.out.println("===========EXPERIENCE CANDIDATE============");
		for (Candidates candidates :listCand) {
			if (candidates.getCandType()==0) {
				System.out.println(candidates.getName());
			}
		}
		System.out.println("===========FRESHER CANDIDATE===============");
		for (Candidates candidates :listCand) {
			if (candidates.getCandType()==1) {
				System.out.println(candidates.getName());
			}
		}
		System.out.println("===========INTERN CANDIDATE================");
		for (Candidates candidates :listCand) {
			if (candidates.getCandType()==2) {
				System.out.println(candidates.getName());
			}
		}
	}
	
	public Candidates searchCand()
	{
		String name = inputter.inputGeneral("Tên ứng viên cần tìm: ");
		int type =0;
		try {
			type = inputter.inputCandType("Loại ứng viên: ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Candidates candidates : listCand) {
			if (name.equals(candidates.getName()) && type == candidates.getCandType()) {
				return candidates;
			}
		}
		return null;
	}
	
	public void displayEachCand(ExperienceCand cand) {
		System.out.println(cand);
	}
	public void displayEachCand(FresherCand cand) {
		System.out.println(cand);
	}
	public void displayEachCand(InternCand cand) {
		System.out.println(cand);
	}
}
