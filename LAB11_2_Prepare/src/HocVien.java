
public class HocVien {
	int id;
	String fullName;
	String yearOfBirth;
	float test1Score;
	float test2Score;
	float finalScore;
	
	public HocVien(int id, String fullName, String yearOfBirth, float test1Score, float test2Score, float finalScore) {
		this.id = id;
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.test1Score = test1Score;
		this.test2Score = test2Score;
		this.finalScore = finalScore;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public float getTest1Score() {
		return test1Score;
	}
	public void setTest1Score(float test1Score) {
		this.test1Score = test1Score;
	}
	public float getTest2Score() {
		return test2Score;
	}
	public void setTest2Score(float test2Score) {
		this.test2Score = test2Score;
	}
	public float getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}
	
	public float averageScore() {
		float result = ((test1Score+test2Score)/2 + finalScore*2)/3;
		return result;
	}
	
	public String classification() {
		float average = averageScore();
		if (average<5) return "Failed";
		else if (average<7) return "Average";
		else if (average<8) return "Good";
		else return "Execellent";
	}
	
	public void display() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return id + " | " + fullName + " | " + yearOfBirth + " | "
				+ averageScore()+ " | " + classification();
	}
	
}
