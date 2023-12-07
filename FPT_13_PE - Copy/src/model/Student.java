package model;

public class Student {
	private String id;
	private String name;
	private double average;
	private String password;
	public Student()
	{
		
	}
	public Student(String id, String name, double average) {
		this.id = id;
		this.name = name;
		this.average = average;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean changePassword(String oldPassword, String newPassword)
	{
		if (this.password.equals(oldPassword)) {
			this.password = newPassword;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", average=" + average + ", password=" + password + "]";
	}
	
}
