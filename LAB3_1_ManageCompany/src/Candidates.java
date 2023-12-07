
public abstract class Candidates {
	private String id;
	private String name;
	private String birthDate;
	private String address;
	private String phone;
	private String email;
	private int candType;

	public Candidates() {

	}

	public Candidates(String id, String name, String birthDate, String address, String phone, String email,
			int candType) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.candType = candType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCandType() {
		return candType;
	}

	public void setCandType(int candType) {
		this.candType = candType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
