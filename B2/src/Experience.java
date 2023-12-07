
public class Experience extends Candidate {
	private int yearExperience;
	private String profestionalSkill;

	public Experience(String id, String firstName, String lastName, int birthDay, String address, String phone,
			String email, int candidatetype) {
		super(id, firstName, lastName, birthDay, address, phone, email, candidatetype);
		this.profestionalSkill = profestionalSkill;
		this.yearExperience = yearExperience;
	}

	public int getyearExperience(int yearExperience) {
		return yearExperience;
	}

	public void setyearExperience() {
		this.yearExperience = yearExperience;
	}

	public String getprofestionalSkill() {
		return profestionalSkill;
	}

	public void setprofestionalSkill(String profestionalSkill) {
		this.profestionalSkill = profestionalSkill;
	}

}
