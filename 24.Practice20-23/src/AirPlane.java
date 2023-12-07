
public class AirPlane extends Vehicle {

	private String nameOfFuel;
	
	public AirPlane(Brand nameBrand,  String nameOfFuel) {
		super(nameBrand,"AirPlane");
		this.nameOfFuel = nameOfFuel;
	}

	
	
	public String getNameOfFuel() {
		return nameOfFuel;
	}

	public void setNameOfFuel(String nameOfFuel) {
		this.nameOfFuel = nameOfFuel;
	}



	public void takeOff()
	{
		System.out.println("Cat canh");
	}
	
	public void putDown()
	{
		System.out.println("Ha canh");
	}
	
	public double getVelocity() {
		return 600;
	}

}
