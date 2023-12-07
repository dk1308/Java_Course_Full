
public class Contact {
	private int id;
	private String fullName;
	private String group;
	private String address;
	private String phone;
	private String firstName;
	private String lastName;
	public Contact(int id, String fullName, String group, String address, String phone) {
		this.id = id;
		this.fullName = fullName;
		this.group = group;
		this.address = address;
		this.phone = phone;
		separateName();
	}
	
	public Contact() {
		
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void separateName() {
		int spaceIdx = this.fullName.indexOf(" ");
		if (spaceIdx>0) {
			this.firstName = this.fullName.substring(0, spaceIdx).trim();
			this.lastName = this.fullName.substring(spaceIdx+1, this.fullName.length()).trim();
		}
	}

	@Override
	public String toString() {
		return id +"\t"+ fullName +"\t"+ firstName +"\t"+ lastName +"\t"+ group +"\t"+ address
				+"\t"+ phone;
	}
	
	
}
