package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class ViDuObjectReader {
	public static void main(String[] args) {
		File f1 = new File("D:\\Dev\\JavaCourse\\48.ObjectWriter\\file.data");
		File f2 = new File("D:\\Dev\\JavaCourse\\49.ObjectReader\\file.data");
		File f3 = new File("D:\\Dev\\JavaCourse\\48.ObjectWriter\\file.txt");
		File f4 = new File("D:\\Dev\\JavaCourse\\49.ObjectReader\\file.txt");
		try {
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
			Files.copy(f3.toPath(), f4.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			InputStream is2 = new FileInputStream(f2);
			InputStream is4 = new FileInputStream(f4);
			ObjectInputStream ois2 = new ObjectInputStream(is2);
			ObjectInputStream ois4 = new ObjectInputStream(is4);
			SinhVien sv = (SinhVien)ois2.readObject();
			System.out.println(sv.getDiem());
			System.out.println(sv);
			while (true) {
				SinhVien sinhVien = (SinhVien)ois4.readObject();
				if (sinhVien==null) 
					break;
				else System.out.println(sinhVien);
			}
			ois2.close();
			ois4.close(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
