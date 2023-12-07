
public class FresherCand extends Candidates {
	private int gradDate;
	private String gradRank;
	private String uni;
	public FresherCand(String id, String name,String birthDate, String address, String phone,
			String email, int candType, int gradDate, String gradRank, String uni)
	{
		super(id, name,birthDate, address, phone, email, candType);
		this.gradDate = gradDate;
		this.gradRank = gradRank;
		this.uni = uni;
	}
	
	@Override
	public String toString() {
		return this.getName() + "|" + this.getBirthDate() + "|" + this.getAddress() + "|" + this.getPhone() + "|" + this.getEmail() +"|" + this.getCandType() ;
	}
}
