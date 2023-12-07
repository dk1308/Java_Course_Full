
public class Station {
	int[] garbageQuantity;
	Truck truck;
	
	public Station(int[] garbageQuantity, Truck truck) {
		this.garbageQuantity = garbageQuantity;
		this.truck = truck;
	}

	long calToTalCost() {
		int totalEachTruck = 0;
		float totalTimeLoad = 0;
		long totalCost = 0;
		int i=0;
		
		while (i<this.garbageQuantity.length) {
			while(true) {
				if(i>=this.garbageQuantity.length) break;
				if ( (totalEachTruck + this.garbageQuantity[i]) < this.truck.maxQuantity  ) {
					totalTimeLoad += this.truck.timeLoad;
					totalEachTruck += this.garbageQuantity[i];
					i++;
					continue;
				} else if( (totalEachTruck + this.garbageQuantity[i])== this.truck.maxQuantity) {
					totalTimeLoad += this.truck.timeLoad;
					totalEachTruck += this.garbageQuantity[i];
					i++;
					break;
				} else break;
			}
			totalCost += (totalTimeLoad + this.truck.timeToFromDump)*this.truck.costEachMinute + this.truck.costEachTruck;
			totalTimeLoad =0;
			totalEachTruck =0;
		}
		return totalCost;
	}
}
