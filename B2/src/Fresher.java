
public class Fresher extends Candidate {
	private String graduationDate;
	private String graduationRank;
	private String education;

	public Fresher(String id, String firstName, String lastName, int birthDay, String address, String phone,
			String email, String string, int candidatetype) {
		super(id, firstName, lastName, birthDay, address, phone, email, candidatetype);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGraduationRank() {
		return graduationRank;
	}

	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

}
