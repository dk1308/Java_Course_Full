
public class MovieManage {
	private String nameMovie;
	private int yearPublish;
	private Brand brand;	
	private double priceTicket;
	private DayPublic dayPublic;
	public MovieManage(String nameMovie, int yearPublish,
			Brand brand, double priceTicket, DayPublic dayPublic) 
	{
		this.nameMovie = nameMovie;
		this.yearPublish = yearPublish;
		this.brand = brand;
		this.priceTicket = priceTicket;
		this.dayPublic = dayPublic;
	}
	
	

	public boolean checkMovieCheaper(MovieManage anotherMovie)
	{
		if(this.priceTicket < anotherMovie.priceTicket)
		{
			return false;
		}
		else return true;
	}
	
	public String getNameMovie() {
		return nameMovie;
	}
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}



	public void printBrand()
	{
		System.out.println("Ten hang phim "+this.getNameMovie()+": "+brand.getNameBrand());
	}
	
	public double printPriceAfterSale(double x)
	{
		return this.priceTicket*(1-x/100);
	}
	
	
}
