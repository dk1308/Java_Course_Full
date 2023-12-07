
public class Main {
	public static void main(String[] args) {
		Truck truck = new Truck();
		int[] garbageEachStation = new int[] {1755, 2808, 952, 4206, 3102, 3902, 1292, 3985, 8324, 1928, 4426, 397, 3277};
		Station station = new Station(garbageEachStation, truck);
		
		System.out.println("Total cost: "+station.calToTalCost());
//		System.out.println("hello");
	}
}
