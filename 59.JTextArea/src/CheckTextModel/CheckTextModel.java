package CheckTextModel;

public class CheckTextModel {
	private String text;
	private String checkText;
	private int numOfExist;

	public CheckTextModel() {
		this.text = "";
		this.checkText = "";
		this.numOfExist = 0;
	}

	public String getTextt() {
		return text;
	}

	public void setTextt(String text) {
		this.text = text;
	}

	public String getCheckText() {
		return checkText;
	}

	public void setCheckText(String checkText) {
		this.checkText = checkText;
	}

	public int getNumOfExist() {
		return numOfExist;
	}

	public void setNumOfExist(int numOfExist) {
		this.numOfExist = numOfExist;
	}

	public void search() {
		int count = 0;
		int location = 0;
		while (true) {
			int i = this.text.indexOf(this.checkText, location);
			if (i == -1) {
				break;
			} else {
				count++;
				location = i+1;
			}
		}
		this.numOfExist = count;
	}
}
