
public class Brand {
	private String nameBrand;
	private String country;
	public Brand(String nB, String c)
	{
		this.nameBrand = nB;
		this.country =c;
	}
	public String getNameBrand() {
		return nameBrand;
	}
	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
