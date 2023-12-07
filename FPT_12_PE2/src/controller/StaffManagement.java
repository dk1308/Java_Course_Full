package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import model.Staff;
import model.StaffList;
import view.Menu;

public class StaffManagement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StaffList staffList = new StaffList();
		Menu menu = new Menu();
		String[] mainMenu = new String[] { "Display all staff", "Remove staff", "Search staff", "Login",
				"Change password" };
		String[] subMenu = new String[] { "Search by name", "Search by department", "Search by id" };
		int choice;
		int subchoice;
		do {
			System.out.println();
			System.out.println("STAFF MANAGEMNET");
			choice = menu.getChoice(mainMenu);
			switch (choice) {
			case 1: {
				printList(staffList.listOfStaff);
				break;
			}
			case 2: {
				System.out.println("Enter id staff to remove: ");
				String idRemove = sc.nextLine();
				staffList.removeStaff(idRemove);
				System.out.println("Remove staff successfully");
				break;
			}
			case 3: {

				do {
					System.out.println();
					System.out.println("STAFF SEARCH");
					subchoice = menu.getChoice(subMenu);
					switch (subchoice) {
					case 1: {
						System.out.println("Enter name to search: ");
						String nameSearch = sc.nextLine();
						printList(staffList.searchStaffByName(nameSearch));
						break;
					}
					case 2: {
						System.out.println("Enter department to search: ");
						String departmentSearch = sc.nextLine();
						printList(staffList.searchStaffByDepartment(departmentSearch));
						break;
					}
					case 3: {
						System.out.println("Enter id to search: ");
						String idSearch = sc.nextLine();
						printList(staffList.searchStaffById(idSearch));
						break;
					}
					default:
						break;
					}
				} while (subchoice >= 1 && subchoice <= 3);
				break;
			}
			case 4: {
				System.out.println("Enter id to login: ");
				String id = sc.nextLine();
				System.out.println("Enter password to login: ");
				String password = sc.nextLine();
				for (Staff staff : staffList.listOfStaff) {
					if (staff.getId().equals(id)) {
						if (staff.getPassword().equals(password)) {
							System.out.println("Login successfully");
							System.out.println("Your account: ");
							System.out.println(staff);
						} else
							System.out.println("Incorrect password");
					} else
						System.out.println("Incorrect staff id");
				}
				break;
			}
			case 5: {
				System.out.println("Enter id to change password: ");
				String id = sc.nextLine();
				for (Staff staff : staffList.listOfStaff) {
					if (staff.getId().equals(id)) {
						System.out.println("Enter old password: ");
						String oldPassword = sc.nextLine();
						System.out.println("Enter new password to change: ");
						String newPassword = sc.nextLine();
						if (!staff.changePassword(oldPassword, newPassword)) {
							System.out.println("Incorrect old password");
						}
					}
				}
				break;
			}
			}
		} while (choice >= 1 && choice <= 5);
	}

	public static void printList(ArrayList<Staff> list) {
		for (Staff staff : list) {
			System.out.println(staff);
		}
	}
}
