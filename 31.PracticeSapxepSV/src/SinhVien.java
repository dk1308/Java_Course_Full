
public class SinhVien implements Comparable<SinhVien> {
	private String name;
	private int age;
	private String classRoom;
	private double avePoint;
	public SinhVien()
	{
		
	}
	public SinhVien(String name, int age, String classRoom, double avePoint) {
		super();
		this.name = name;
		this.age = age;
		this.classRoom = classRoom;
		this.avePoint = avePoint;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getClassRoom() {
		return classRoom;
	}
	public double getAvePoint() {
		return avePoint;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}
	public void setAvePoint(double avePoint) {
		this.avePoint = avePoint;
	}
	
	public void disSinhVien()
	{
		System.out.println("Ten: "+ this.name);
		System.out.println("Tuoi: "+ this.age);
		System.out.println("Lop: "+ this.classRoom);
		System.out.println("Diem trung binh: "+ this.avePoint);
	}
	
	public String getFirstName(String sv) {
		String fn;
		String name = sv.trim();
		if (name.indexOf(" ") >= 0) {
			int vt = name.lastIndexOf(" ");
			fn = name.substring(vt + 1);
		} else
			fn = name;

		return fn;
	}
	
	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		String thisFn = getFirstName(this.getName());
		String oFn = getFirstName(o.getName());
		return thisFn.compareTo(oFn);
	}
	
	
}
