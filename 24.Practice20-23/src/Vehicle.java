
public abstract class Vehicle {
	
	protected String nameOfVehicle;
	protected Brand nameBrand;
	public Vehicle(Brand nameBrand,String nameOfVehicle) {
		this.nameOfVehicle = nameOfVehicle;
		this.nameBrand = nameBrand;
	}

	public String getNameOfBrand()
	{
		return this.nameBrand.getNameOfBrand();
	}
	
	public void start()
	{
		System.out.println("start");
	}
	
	public void speedUp()
	{
		System.out.println("speed up");
	}
	
	public void stop()
	{
		System.out.println("stop!");
	}	
	
	public abstract double getVelocity();

}
