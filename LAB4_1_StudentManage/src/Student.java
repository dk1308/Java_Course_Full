
public class Student implements Comparable<Student>{
	
	private String id;
	private String name;
	private int semester;
	private String course;
	public Student(String id, String name, int semester, String course) {
		this.id = id;
		this.name = name;
		this.semester = semester;
		this.course = course;
	}
	public Student() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	@Override
	public String toString() {
		return id + " | " + name + " | " + semester + " | " + course;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
