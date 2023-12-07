/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Company;
import model.Customer;
import view.Menu;
import view.Validation;

/**
 *
 * @author ADMIN
 */
public class CompanyManage {
	public static void main(String[] args) throws Validation {
		Scanner sc = new Scanner(System.in);
		int choice;
		Company company = new Company();
		String[] choiceArray = new String[] { "Display all Customers", "Customer Search", "Add new Customer",
				"Sort decrease by name", "Customer statistical" };
		Menu menu = new Menu();	
		do {
			System.out.println("Company Management System");
			choice = menu.getChoice(choiceArray);
			switch (choice) {
			case 1:
				company.printList();
				break;
			case 2:
				company.searchByName();
				break;
			case 3:
				try {
					company.addCustomer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				company.sortCustomerByName();
				break;
			case 5:
				company.statisticCustomer();
				break;
			}
		} while (choice >= 1 || choice <= 4);
		
	}
}
