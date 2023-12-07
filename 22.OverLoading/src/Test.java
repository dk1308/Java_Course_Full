
public class Test {
	public static void main(String[] args) {
		MyMath mm =new MyMath();
		System.out.println("Tim min 2 so nguyen: "+mm.timMin(10, 16));
		System.out.println("");
		System.out.println("Tim min 2 so thuc: "+mm.timMin(10.5, 16.5));
		System.out.println("");
		System.out.println("Tong 2 so thuc: "+mm.tinhTong(10.5,16.5));
		System.out.println("");
		
		double[]arr=new double[] {1,2,5,6,7};
		System.out.println("Tong arr: "+mm.tinhTong(arr));
		
	}
}
