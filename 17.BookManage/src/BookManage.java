import java.util.Objects;

public class BookManage {
	private String n;
	private int y;
	private int p;
	private TacGia tacgia;

	
	
	
	
	public BookManage(String n, int y, int p, TacGia tacgia) {
		this.n = n;
		this.y = y;
		this.p = p;
		this.tacgia = tacgia;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}



	public void namePrint()
	{
		System.out.println(n);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		BookManage other = (BookManage) obj;
		return this.y == other.y;
	}
	
	
	public double priceAfterSale(double s)
	{
		return this.p*(1-s/100);
	}
	
	
	
	
	
}
