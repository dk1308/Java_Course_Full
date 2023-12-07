import java.util.Arrays;

public class LearningSchedule {

	private Day d;
	private Subject []s;
	public LearningSchedule(Day d, Subject[] s) {
		super();
		this.d = d;
		this.s = s;
	}
	public Day getD() {
		return d;
	}
	public Subject[] getS() {
		return s;
	}
	public void setD(Day d) {
		this.d = d;
	}
	public void setS(Subject[] s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return " day: " + d + ", subjects: " + Arrays.toString(s);
	}
	
	

	
}
