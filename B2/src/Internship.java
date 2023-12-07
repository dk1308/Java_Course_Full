
public class Internship extends Candidate {
private String maJor;
private String Semester;
private String universityName;


	public Internship(String id, String firstName, String lastName, int birthDay, String address, String phone,
			String email, int candidatetype, String maJor, String semester, String universityName) {
		super(id, firstName, lastName, birthDay, address, phone, email, candidatetype);
		this.maJor = maJor;
		Semester = semester;
		this.universityName = universityName;
	}


	public String getMaJor() {
		return maJor;
	}


	public void setMaJor(String maJor) {
		this.maJor = maJor;
	}


	public String getSemester() {
		return Semester;
	}


	public void setSemester(String semester) {
		Semester = semester;
	}


	public String getUniversityName() {
		return universityName;
	}


	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	

}
 