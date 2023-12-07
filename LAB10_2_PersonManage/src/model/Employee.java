package model;

public class Employee {
	private String code;
	private String name;
	private String gender;
	private String dob;
	private String degree;
	
	
	public Employee(String code, String name, String gender, String degree, String dob) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.degree = degree;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getType() {
		return degree;
	}
	public void setType(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return code + " | " + name + " | " + gender + " | " + degree + " | " + dob;
	}
	
	

}
