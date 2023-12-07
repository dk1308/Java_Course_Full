
public class Rectangle extends Shape {
	private double width;
	private double heigth;
	public Rectangle(ToaDo toaDo, double width, double heigth) {
		super(toaDo);
		this.width = width;
		this.heigth = heigth;
	}
	@Override
	public double calArea() {
		return this.width*this.heigth;
	}

}
