
public class Circle extends Shape {
	private double r;
	
	public Circle(ToaDo toaDo, double r) {
		super(toaDo);
		this.r =r;
	}

	@Override
	public double calArea() {
		return Math.PI*this.r*this.r;
	}
	
	
}
