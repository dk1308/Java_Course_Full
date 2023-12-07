
public class Test {
	public static void main(String[] args) {
		SetAndGet date1 = new SetAndGet(5, 10, 2020);
		SetAndGet date2 = new SetAndGet(10, 10, 2020);
//		1. Set and get
		System.out.println(date1);
		date1.setDay(35);
		System.out.println(date1.getDay());
		date1.setDay(15);
		System.out.println(date1.getDay());
		
//		2. hashCode and Equal
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(date1.equals(date2));
		
//		3. toString
		System.out.println(date1);
	}
}
