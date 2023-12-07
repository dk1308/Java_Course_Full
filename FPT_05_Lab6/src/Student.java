import java.util.Objects;

public class Student{
	private String code; 
	private String name;
	private int mark;
	public Student(String code, String name, int mark) {
		this.code = code;
		this.name = name;
		this.mark = mark;
	}
	public Student()
	{
		
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return this.code + ", " + this.name + ", " + this.mark;
	}

}
