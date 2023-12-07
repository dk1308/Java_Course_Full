
public class Test {
	public static void main(String[] args) {
//		System.out.println("Kiem tra sap xep: ");
//		double arr1[]= new double[] {1,2,5,6,-8,10};
//		double arr2[]= new double[] {45,7,-10,6,-8,20};
//		
//		SapXepChen sxIns = new SapXepChen();
//		SapXepChon sxSel = new SapXepChon();
//		sxIns.sxGiam(arr1);
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		System.out.println();
//		sxSel.sxTang(arr2);
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}
		
		PhanMemMayTinh pm = new PhanMemMayTinh();
		
		System.out.println("Kết quả 5+6 = "+pm.cong(5, 6));
		double arr3[]= new double[] {4,3,20,6,-7,10};
		pm.sxTang(arr3);
		System.out.println("Kết quả sắp xếp mảng arr3: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
	
}
