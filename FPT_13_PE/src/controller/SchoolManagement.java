package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Student;
import model.School;
import view.Menu;

public class SchoolManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School studentList = new School();
		Menu menu = new Menu();
		String[] mainMenu = new String[] {"Display all Students", "Student Search", "Add new Student", "Set Password", "Exit"};
		String[] subMenu = new String[] { "Find by StudentID","Find by Name"};
		int choice;
		int subchoice;
		do {
			System.out.println();
			System.out.println("SCHOOL MANAGEMNET SYSTEM");
			choice = menu.getChoice(mainMenu);
			switch (choice) {
			case 1: {
				studentList.printList(studentList.listOfStudent);
				break;
			}
			case 2: {
				do {
					System.out.println();
					System.out.println("Student searching");
					subchoice = menu.getChoice(subMenu);
					switch (subchoice) {
					case 1: {
						System.out.println("Enter ID: ");
						String id = sc.nextLine().toUpperCase();
						studentList.searchStudentById(id);
						break;
					}
					case 2: {
						System.out.println("Enter Name: ");
						String name = sc.nextLine().trim();
						studentList.searchStudentByName(name);
						break;
					}
					default:
						break;
					}
				} while (subchoice >= 1 && subchoice <= 2);
				break;
			}
			case 3: {
				studentList.addStudent();
				break;
			}
			case 4: {
				studentList.setPassword();
				break;
			}
			default:
				System.out.println("Bye!");
				break;
		}
		} while (choice >= 1 && choice <= 4);
	}
}
