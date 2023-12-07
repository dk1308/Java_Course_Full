import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tien moi ki: ");
		double price = sc.nextDouble();
		System.out.println("Nhap khoi luong: ");
		double weight = sc.nextDouble();
		
		ReceiptOfCoffee rc= new ReceiptOfCoffee("Loai 1", weight, price);
		
//		1. In hoa don
		System.out.println("Tong tien la "+ rc.Receipt("Loai 1",weight,price));
		
//		2. Kiem tra gia
		System.out.println("Nhap 1 gia: ");
		double gia = sc.nextDouble();
		System.out.println("Tong so tien vuot qua "+gia+" la "+rc.weightCheck(price, gia));
		
//		3. Giam gia
		System.out.println("Giam: ? (%) ");
		double x = sc.nextDouble();
		System.out.println("So tien duoc giam la "+rc.saleOff(x));
		
//		4. Tinh tien sau khi giam
		System.out.println("So tien sau khi giam la "+rc.priceAfterSale(x));
	}
}
