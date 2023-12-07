package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import view.Validation;

public class School {
	public ArrayList<Student> listOfStudent = new ArrayList<>();
	
	public School()
	{
		Student st1 = new Student("S01", "Jonh Horstman", 7.8);
		Student st2 = new Student("S02", "John Smith", 8.5);
		Student st3 = new Student("S03", "Cays Horstman", 9.6);
		Student st4 = new Student("S04", "David Beckham", 8.0);
		this.listOfStudent.add(st1);
		this.listOfStudent.add(st2);
		this.listOfStudent.add(st3);
		this.listOfStudent.add(st4);
	}
	
	
	
	public void searchStudentByName(String name)
	{
		ArrayList<Student> listSearch = new ArrayList<>();
		for (Student student : this.listOfStudent) {
			if (student.getName().contains(name)) {
				listSearch.add(student);
			}
		}
		if (listSearch.size()==0) {
			System.out.println("Can not find student!");
		} else  printList(listSearch);
	}
	
	public void searchStudentById(String id)
	{
		ArrayList<Student> listSearch = new ArrayList<>();
		for (Student student : this.listOfStudent) {
			if (student.getId().equals(id)) {
				listSearch.add(student);
			}
		}
		if (listSearch.size()==0) {
			System.out.println("Can not find student!");
		} else  printList(listSearch);
	}
	
	public void printList(ArrayList<Student> list) {
		System.out.println("List of Customers");
		System.out.println("--------------------");
		for (Student customer : list) {
			System.out.println(customer);
		}
		System.out.println("--------------------");
		System.out.println("Total: " + list.size() + " student(s).");
	}
	
	public void addStudent()  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add new student");
		System.out.println("--------------------");
		String newID;
		String newName="";
		double newAverage;
//            Them ID
		do {
			System.out.println("New ID: ");
			newID = sc.nextLine().toUpperCase();
			try {
				throwFaultID(newID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (isDupplicatedID(newID) || isWrongPatternID(newID));

//            Them name
		do {
			System.out.println("New name: ");
			newName = sc.nextLine().trim();
			try {
				throwFaultName(newName);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (newName.isBlank() || isWrongName(newName));

//            Them diem
		do {
			System.out.println("New average mark: ");
			newAverage = sc.nextDouble();
			try {
				throwFaultMark(newAverage);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (isWrongMark(newAverage));

//            Them student
		Student newsStudent = new Student(newID, newName, newAverage);
		this.listOfStudent.add(newsStudent);

		System.out.println("Add customer successfully!");
	}
	
	public void setPassword()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Set password");
		System.out.println("--------------------");
		System.out.println("Enter id to set password: ");
		String id = sc.nextLine().toUpperCase();
		System.out.println("Enter password to set: ");
		String password = sc.nextLine().trim();
		int count = 0;
		for (Student student : listOfStudent) {
			if (student.getId().equals(id)) {
				student.setPassword(password);
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("Can not find student to set password!");
		} else System.out.println("Set password successfully");
	}
	
	
//	A.Loi khi nhap id
	public boolean isDupplicatedID(String oID) {
		for (Student student : this.listOfStudent) {
			if (student.getId().equals(oID)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isWrongPatternID(String id)
	{
		if (!id.matches("[Ss][0-9]{2,5}")) {
			return true;
		}else return false;
	}
	
	public void throwFaultID(String id) throws Validation
	{
		if (isWrongPatternID(id)) {
			throw new Validation("ID doesn't match pattern!");
		} else if (isDupplicatedID(id)) {
			throw new Validation("ID is dupplicated!");
		} 
	}
	
	
//	B.Loi khi nhap name
	public boolean isWrongName(String name)
	{
		char arrName[] = name.toCharArray();
		for (int i = 0; i < arrName.length; i++) {
			if (arrName[i]==32 || (arrName[i]>=65 && arrName[i]<=90) || (arrName[i]>=97 && arrName[i]<=122)) {
				
			} else return true;
		}
		return false;
	}
	
	public void throwFaultName(String name) throws Validation
	{
		if (isWrongName(name)) {
			throw new Validation("Name contains only letters");
		} 
	}
	
//	C.Loi khi nhap diem
	public boolean isWrongMark(double mark)
	{
		if (mark<0 || mark>10) {
			return true;
		}else return false;
	}
	
	public void throwFaultMark(double mark) throws Validation
	{
		if (isWrongMark(mark)) {
			throw new Validation("0<= mark <= 10");
		}
	}
	
}
