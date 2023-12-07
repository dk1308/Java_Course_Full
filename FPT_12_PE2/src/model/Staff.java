package model;

public class Staff {
	private String id;
	private String name;
	private String department;
	private String password;
	public Staff()
	{
		
	}
	public Staff(String id, String name, String department, String password) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.password = password;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", department=" + department + ", password=" + password + "]";
	}
	
	public boolean changePassword(String oldPassword, String newPassword)
	{
		if (this.password.equals(oldPassword)) {
			this.password = newPassword;
			return true;
		}
		return false;
	}
}
