
public class SinhVien implements Comparable<SinhVien>{
	private int mssv;
	private String name;
	private int age;
	
	
	public SinhVien(int mssv, String name, int age) {
		this.mssv = mssv;
		this.name = name;
		this.age = age;
	}
	
	

	public int getMssv() {
		return mssv;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public void setMssv(int mssv) {
		this.mssv = mssv;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}

	public String getTen()
	{
		if(this.name.indexOf(" ")>=0)
		{
			int vt = this.name.lastIndexOf(" ");
			return this.name.substring(vt+1);
		}
		return this.name;
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.getTen().compareTo(o.getTen());
	}

}
