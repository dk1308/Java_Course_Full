
public class Student {
	String name; 
	int age; 
	public Student() {}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age+"]";
	}
}
