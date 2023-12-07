package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuObjectWriter {
	public static void main(String[] args) {
			File f = new File("D:\\Dev\\JavaCourse\\48.ObjectWriter\\file.data.txt");
			SinhVien sv = new SinhVien("DE170341", "Khoa", 19, 10);

			OutputStream os;
			try {
				os = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(sv);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
