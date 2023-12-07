package main;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTapTin {
	public static void main(String[] args) {
		
		File folder1 = new File("D:\\Dev\\JavaCourse\\42.FileAndFolder");
		File folder2 = new File("D:\\Dev\\JavaCourse\\42a.");
//		exists()
		System.out.println("folder1 ton tai: "+folder1.exists());
		System.out.println("folder2 ton tai: "+folder2.exists());
//		mkdir()
		File f1 = new File("D:\\Dev\\JavaCourse\\42a.File");
		f1.mkdir();
//		mkdirs()
		File f2 = new File("D:\\Dev\\JavaCourse\\42a.File\\khoa\\chut\\giang\\ha");
		f2.mkdirs();
//		createNewFile()
		File f3 = new File("D:\\Dev\\JavaCourse\\42a.File\\khoa\\iuchut.txt");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
