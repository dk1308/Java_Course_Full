
public class SapXepChon implements SapXepInterface {

	public void sxTang(double[] arr) {
		int i, j, min_idx = 0;
		for ( i = 0; i < arr.length; i++) {
			min_idx = i;
			for ( j = i+1; j < arr.length; j++) {
				if(arr[j]< arr[min_idx])
					min_idx = j;
			}
			
			double temp=arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}

	public void sxGiam(double[] arr) {	
		int i, j, max_idx = 0;
		for ( i = 0; i < arr.length; i++) {
			max_idx = i;
			for ( j = i+1; j < arr.length; j++) {
				if(arr[j]> arr[max_idx])
					max_idx = j;
			}
			
			double temp=arr[max_idx];
			arr[max_idx] = arr[i];
			arr[i] = temp;
		}
	}

}
