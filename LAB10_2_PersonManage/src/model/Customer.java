package model;

public class Customer {
	private String code;
	private String name;
	private String gender;
	private String dob;
	private String type;
	
	public Customer(String code, String name, String gender, String dob, String type) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.type = type;
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
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return code + " | " + name + " | " + gender + " | " + dob + " | " + type;
	}
}
