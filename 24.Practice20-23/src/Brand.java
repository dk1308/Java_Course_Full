
public class Brand {
	private String nameOfBrand;
	private String country;
	
	
	public Brand(String nameOfBrand, String country) {
		this.nameOfBrand = nameOfBrand;
		this.country = country;
	}
	
	
	public String getNameOfBrand() {
		return nameOfBrand;
	}
	public String getCountry() {
		return country;
	}
	public void setNameOfBrand(String nameOfBrand) {
		this.nameOfBrand = nameOfBrand;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
