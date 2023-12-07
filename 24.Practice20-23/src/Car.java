
public class Car extends Vehicle {

	private String nameOfFuel;
	
	public Car(Brand nameBrand, String nameOfFuel) {
		super(nameBrand,"Car");
		this.nameOfFuel = nameOfFuel;
	}
	
	



	public String getNameOfFuel() {
		return nameOfFuel;
	}




	public void setNameOfFuel(String nameOfFuel) {
		this.nameOfFuel = nameOfFuel;
	}







	public double getVelocity() {
		return 60;
	}

}
