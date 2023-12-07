
public class Test {
	public static void main(String[] args) {
		ToaDo td1 = new ToaDo(1, 2);
		ToaDo td2 = new ToaDo(2, 4);
		ToaDo td3 = new ToaDo(5, 10);
		
		Shape s1 = new Point(td1);
		Shape s2 = new Circle(td2, 3);
		Shape s3 = new Rectangle(td3, 2,4);
		
		System.out.println("Dien tich hinh1: "+s1.calArea());
		System.out.println("Dien tich hinh2: "+s2.calArea());
		System.out.println("Dien tich hinh3: "+s3.calArea());
	}
}
