
public class InternCand extends Candidates {
	private String major;
	private String curSemester;
	private String uni;
	public InternCand(String id, String name,String birthDate, String address, String phone,
			String email, int candType, String major, String curSemester, String uni)
	{
		super(id, name,birthDate, address, phone, email, candType);
		this.major = major;
		this.curSemester = curSemester;
		this.uni = uni;
	}
	@Override
	public String toString() {
		return this.getName() + "|" + this.getBirthDate() + "|" + this.getAddress() + "|" + this.getPhone() + "|" + this.getEmail() +"|" + this.getCandType() ;
	}
}
