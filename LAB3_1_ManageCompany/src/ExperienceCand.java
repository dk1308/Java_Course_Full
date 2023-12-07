
public class ExperienceCand extends Candidates {
	private int expYear;
	private String proSkill;
	public ExperienceCand(String id, String name,String birthDate, String address, String phone,
			String email, int candType, int expYear, String proSkill)
	{
		super(id, name,birthDate, address, phone, email, candType);
		this.expYear = expYear;
		this.proSkill = proSkill;
	}
	@Override
	public String toString() {
		return this.getName() + "|" + this.getBirthDate() + "|" + this.getAddress() + "|" + this.getPhone() + "|" + this.getEmail() +"|" + this.getCandType() ;
	}
	
	
}
