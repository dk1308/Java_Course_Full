import java.security.cert.PolicyNode;

public class Circle implements Shape {
	private Point tam;
	private double r;
	
	public Circle(double x, double y, double r) {
		tam = new Point(x,y);
		this.r=r;
	}
	public Circle()
	{
		
	}
	
	public Point getTam(){
		return this.tam;
	}
	
	public double getR() {
		return r;
	}

	public void setTam(Point tam)
	{
		this.tam = tam;
	}
	
	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		return Math.pow(this.r, 2) * Math.PI;
	}
	@Override
	public double tinhChuVi() {
		return 2*this.r*Math.PI;
	}
	
	public double tinhKhoangCachTam(Circle o)
	{
		return this.tam.tinhKhoangCach(o.getTam());
	}
	
	public boolean kiemTraTiepXuc(Circle o)
	{
		double tongBanKinh = this.r + o.getR();
		double khoangCachTam = tinhKhoangCachTam(o);
		if (tongBanKinh == khoangCachTam) 
			return true;
		return false;
	}
}
