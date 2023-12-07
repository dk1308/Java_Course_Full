package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.sound.midi.Patch;

public class ViDu {
	
//	Important
	public static void xoaThuMucCha(File f) {
		while(f.delete() != true) {
			File[] mangCon = f.listFiles();
			for (File fCon : mangCon) {
				System.out.println(fCon.getAbsolutePath());
				xoaThuMucCha(fCon);
			}
		}
	}
//	public static void xoaThuMucCha2(Path p) {
//		while(Files.deleteIfExists(p) != true) {
//			File[] mangCon = p.subpath();
//			for (File fCon : mangCon) {
//				System.out.println(fCon.getAbsolutePath());
//				xoaThuMucCha(fCon);
//			}
//		}
//	}

	public static void main(String[] args) {
		File f0 = new File("D:\\Dev\\JavaCourse\\44.DeleteFileAndFolder\\f0");
		File f1 = new File("D:\\Dev\\JavaCourse\\44.DeleteFileAndFolder\\f1");
		File ftxt = new File("D:\\Dev\\JavaCourse\\44.DeleteFileAndFolder\\ftxt.txt");
/*		Dung ham delete() hoac deleteOnExit();
		--> Xoa file hoac folder rong */
		System.out.println("Delete f0: "+f0.delete());
		System.out.println("Delete f1: "+f1.delete());
		ftxt.deleteOnExit();

		
/*
 * 		Dung ham de quy 
 * 		--> Xoa folder co tep con
 */
		xoaThuMucCha(f0);
		
		
/*
 *		Dung class Path 
 */
		Path p0 = f0.toPath();
		Path p1 = f1.toPath();
		Path ptxt = ftxt.toPath();
		
		try {
			Files.deleteIfExists(p1);
			Files.deleteIfExists(ptxt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
