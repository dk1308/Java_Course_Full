
public class ReceiptOfCoffee {
	private String name;
	private double weight;
	private double price;

	
	public ReceiptOfCoffee(String n, double w, double p)
	{
		this.name = n;
		this.weight =w;
		this.price = p;
	}
	
//	1. In hoa don
	public double Receipt(String name, double weight, double price)
	{
		return this.price * this.weight;
	}
	
//	2. Kiem tra gia
	public boolean weightCheck(double weight, double weightCheck)
	{
		return (weight > weightCheck);
	}
	
//	3. Giam gia
	public double saleOff(double x)
	{
		if(this.Receipt(name, weight, price)>500000)
		{
			return (x/100)*this.Receipt(name, weight, price);
		}else {
			return 0;
		}
	}
	
//	4.Tinh tien sau khi giam
	public double priceAfterSale(double x)
	{
		return this.Receipt(name, weight, price) - this.saleOff(x);
	}
}
