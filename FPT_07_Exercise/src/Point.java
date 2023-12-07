
public class Point {
	private double x;
	private double y;
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point()
	{
		
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double tinhKhoangCach(Point o)
	{
		return Math.sqrt(Math.pow((this.getX()-o.getX()), 2) + Math.pow((this.getY()-o.getY()), 2));
	}
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	public String bieuDienDiem(char c)
	{
		return c+this.toString();
	}
}
