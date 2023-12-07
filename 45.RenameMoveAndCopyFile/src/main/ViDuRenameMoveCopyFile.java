package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;

import javax.swing.text.DefaultEditorKit.CopyAction;

public class ViDuRenameMoveCopyFile {
	
	public static void coppyAll(File beginF, File endF) {
		try {
			Files.copy(beginF.toPath(), endF.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block	
			e.printStackTrace();
		}
		
		if (beginF.isDirectory()) {
			File[] mangCon = beginF.listFiles();
			for (File fileCon : mangCon) {
				File fNew = new File(endF.getAbsoluteFile()+"\\"+fileCon.getName());
				coppyAll(fileCon, fNew);
			}
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("D:\\Dev\\JavaCourse\\45.RenameMoveAndCopyFile\\f1.txt");
		File f2 = new File("D:\\Dev\\JavaCourse\\45.RenameMoveAndCopyFile\\f2.txt");
		File f3 = new File("D:\\Dev\\JavaCourse\\45.RenameMoveAndCopyFile\\f3.txt");
		File f4 = new File("D:\\Dev\\JavaCourse\\44.DeleteFileAndFolder\\f4.txt");
		File folder1 = new File("D:\\Dev\\JavaCourse\\44.DeleteFileAndFolder\\f0");
		File folder2 = new File("D:\\Dev\\JavaCourse\\45.RenameMoveAndCopyFile\\fCopy");
//		Rename - Su dung renameTo()
//		f1.renameTo(f2);
		
//		Rename - Su dung Files.move(, , )
//		try {
//			Files.move(f2.toPath(), f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Move File - Su dung Files.move()
//		try {
//			Files.move(f3.toPath(), f4.toPath(), StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		Su dung ham copyAll()
		coppyAll(folder1, folder2);
	}
}
