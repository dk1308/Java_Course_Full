
public class TestBox {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<Integer>(20);
		Box<Double> b2 = new Box<Double>(20.5);
		Box<String> b3 = new Box<String>("I'm Khoa");
		
		System.out.println("b1: "+b1.getVal());
		System.out.println("b2: "+b2.getVal());
		System.out.println("b3: "+b3.getVal());
	}
}
