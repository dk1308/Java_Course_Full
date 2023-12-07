package Model;

public class MouseModel {
	private int x;
	private int y;
	private int numOfClick;
	private String isEntered;
	public MouseModel()
	{
		this.x = 0;
		this.y = 0;
		this.numOfClick = 0;
		this.isEntered = "no";
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getNumOfClick() {
		return numOfClick;
	}
	public void setNumOfClick(int numOfClick) {
		this.numOfClick = numOfClick;
	}
	public String getIsEntered() {
		return isEntered;
	}
	public void setIsEntered(String isEntered) {
		this.isEntered = isEntered;
	}
	
	public void addClick()
	{
		this.numOfClick++;
	}
}