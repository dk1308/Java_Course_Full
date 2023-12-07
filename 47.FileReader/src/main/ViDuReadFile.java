package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuReadFile {
	public static void main(String[] args) {
		File f = new File("D:\\Dev\\JavaCourse\\47.FileReader\\ftext.txt");


		try {
			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = br.readLine();
				if (line != null)
					System.out.println(line);
				else
					break;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			List<String> listF = Files.readAllLines(f.toPath());
			for (String line : listF) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
