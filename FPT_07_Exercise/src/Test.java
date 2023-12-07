
public class Test {
	public static void main(String[] args) {
		Point pA = new Point(5, 1);
		Point pB = new Point(2, 5);
		System.out.println("The distance between "+pA.bieuDienDiem('A')+" and "+pB.bieuDienDiem('B')+" is "+pB.tinhKhoangCach(pA));
		
		Circle cA = new Circle(5, 1, 3);
		Circle cB = new Circle(2, 5, 3);
		
		if (cA.kiemTraTiepXuc(cB)==true) 
			System.out.println("Đường tròn tâm "+pA.bieuDienDiem('A')+" bán kính "+cA.getR()+" tiếp xúc với "
					+"đường tròn tâm "+pB.bieuDienDiem('B')+" bán kính "+cB.getR());
		else System.out.println("Đường tròn tâm "+pA.bieuDienDiem('A')+" bán kính "+cA.getR()+" không tiếp xúc với "
				+"đường tròn tâm "+pB.bieuDienDiem('B')+" bán kính "+cB.getR());
	}
}
