package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class TestFileWriter {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:\\Dev\\JavaCourse\\46.FileWriter\\f.txt","UTF-8");
			pw.print("Hello World");
			pw.println("\nI'm Khoa");
			pw.println("Test write a object!");
			Employee emp = new Employee("Khoa", 19, 100000000);
			pw.print(emp.toString(	));
			pw.flush();
			pw.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
