
public abstract class Shape {
	protected ToaDo toaDo;

	public Shape(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	public abstract double calArea();
		
}
