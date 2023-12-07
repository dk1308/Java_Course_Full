
public class Test {
	public static void main(String[] args) {
		Brand br1 = new Brand("VietNam Airline", "VietNam");
		Brand br2 = new Brand("Vinfast","VietNam");
		Brand br3 = new Brand("Vinbike","VietNam");
		
		Vehicle vh1 = new AirPlane(br1, "Petrol");
		Vehicle vh2 = new Car(br2, "Petrol");
		Vehicle vh3 = new Bike(br3);
		
		AirPlane ap = new AirPlane(br1, "Petrol");
		Car c =new Car(br2, "Petrol");
				
		System.out.println("Van toc vh1: "+ vh1.getVelocity());
		System.out.println("Van toc vh2: "+ vh2.getVelocity());
		System.out.println("Van toc vh3: "+ vh3.getVelocity());
		
		System.out.println("Hang san xuat vh1: "+vh1.getNameOfBrand());
		System.out.println("Hang san xuat vh2: "+vh2.getNameOfBrand());
		System.out.println("Hang san xuat vh3: "+vh3.getNameOfBrand());
		
		System.out.println("------");
		System.out.println("Nhien lieu airplane: "+ap.getNameOfFuel());
		System.out.println("Nhien lieu car: "+c.getNameOfFuel());
		
		System.out.println("------");
		ap.takeOff();
		ap.putDown();
	}
}
