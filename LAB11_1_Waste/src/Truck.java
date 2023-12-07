
public class Truck {
	int maxQuantity;
	float timeLoad;
	float timeToFromDump;
	float costEachTruck;
	float costEachMinute;
	public Truck() {
		this.maxQuantity = 10000;
		this.timeLoad = 8;
		this.timeToFromDump = 30;
		this.costEachTruck = 57000;
		this.costEachMinute = 120000/60;
	}
}
