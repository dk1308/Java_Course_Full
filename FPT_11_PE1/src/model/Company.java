
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import view.Menu;
import view.Validation;

/**
 *
 * @author ADMIN
 */
public class Company {
	ArrayList<Customer> listOfCustomer = new ArrayList<>();

	public Company() {
		Customer ct1 = new Customer(1, "Jonh Horstman", "0985405999");
		Customer ct2 = new Customer(2, "John Smith", "0906567789");
		Customer ct3 = new Customer(3, "Cays Horstman", "0987787676");
		Customer ct4 = new Customer(4, "Cays Horstman", "0908778887");
		this.listOfCustomer.add(ct1);
		this.listOfCustomer.add(ct2);
		this.listOfCustomer.add(ct3);
		this.listOfCustomer.add(ct4);
	}

	public void printList() {
		System.out.println("List of Customers");
		System.out.println("--------------------");
		for (Customer customer : this.listOfCustomer) {
			System.out.println(customer);
		}
		System.out.println("--------------------");
		System.out.println("Total: " + this.listOfCustomer.size() + " customers.");
	}

	public void searchByName() throws Validation {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Customer Searching");
		System.out.println("--------------------");
		do {
			System.out.println("Name to search: ");
			name = sc.nextLine().trim();
		} while (name.isBlank());

		ArrayList<Customer> listSearch = new ArrayList<>();
		for (Customer customer : listOfCustomer) {
			if (customer.getName().contains(" " + name) || customer.getName().contains(name + " ")) {
				listSearch.add(customer);
			}
		}
		if (listSearch.size()==0) {
			System.out.println("No customer searched!");
		}
		printOtherList(listSearch);
		System.out.println("Search customer by name successfully!");
	}

	public void addCustomer() throws view.Validation, Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Customer");
		System.out.println("--------------------");
		int newID;
		String newName="";
		String newPhone;
//            Them ID
		do {
			System.out.println("New ID: ");
			newID = sc.nextInt();
			try {
				throwFaultID(newID);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (newID < 1 || isDupplicatedID(newID));

//            Them name
		do {
			System.out.println("New name: ");
			sc.nextLine();
			newName = sc.nextLine().trim();
			try {
				throwFaultName(newName);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} while (newName.isBlank() || isLowerName(newName)|| isSpaceName(newName, 0));

//            Them phone
		do {
			System.out.println("New phone: ");
			newPhone = sc.nextLine().trim();
			try {
				throwFaultPhone(newPhone);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (isDupplicatedPhone(newPhone) || isWrongPhone(newPhone));

//            Them customer
		Customer newCustomer = new Customer(newID, newName, newPhone);
		this.listOfCustomer.add(newCustomer);

		System.out.println("Add customer successfully!");
	}

	public void sortCustomerByName() {
		Collections.sort(listOfCustomer, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return -o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("Sort customer decrease by name successfully!");
	}

	public void statisticCustomer() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Customer> listStatistic = new ArrayList<>();
		int choice;
		Menu menu = new Menu();
		String[] choiceArray = new String[] {"Viettel", "Mobiphone", "Vinaphone"};
		do {
			System.out.println();
			System.out.println("Statistical Customer");
			choice= menu.getChoice(choiceArray);
			if (choice == 1) {
				for (Customer customer : listOfCustomer) {
					if (customer.getPhone().charAt(0) == '0' && customer.getPhone().charAt(1) == '9'
							&& customer.getPhone().charAt(2) == '8') {
						listStatistic.add(customer);
					}
				}
			} else if (choice == 2) {
				for (Customer customer : listOfCustomer) {
					if (customer.getPhone().charAt(0) == '0' && customer.getPhone().charAt(1) == '9'
							&& customer.getPhone().charAt(2) == '1') {
						listStatistic.add(customer);
					}
				}
			} else if (choice == 3) {
				for (Customer customer : listOfCustomer) {
					if (customer.getPhone().charAt(0) == '0' && customer.getPhone().charAt(1) == '9'
							&& customer.getPhone().charAt(2) == '0') {
						listStatistic.add(customer);
					}
				}
			} else break;
			printOtherList(listStatistic);
			listStatistic.clear();
			
		} while (choice >= 1 && choice <= 3);
	}

	public void printOtherList(ArrayList<Customer> list) {
		System.out.println("List of Customers");
		System.out.println("--------------------");
		for (Customer customer : list) {
			System.out.println(customer);
		}
		System.out.println("--------------------");
		System.out.println("Total: " + list.size() + " customers.");
	}

	
	
	
	
//	Ham kiem tra loi nhap xuat
	public boolean isDupplicatedID(int oID) {
		for (Customer customer : listOfCustomer) {
			if (customer.getCustomerID() == oID) {
				return true;
			}
		}
		return false;
	}

	public boolean isDupplicatedPhone(String newPhone) {
		for (Customer customer : listOfCustomer) {
			if (customer.getPhone().equals(newPhone)) {
				return true;
			}
		}
		return false;
	}

	public boolean isWrongPhone(String phone) {
		try {
			int intPhone = Integer.parseInt(phone);
		} catch (Exception e) {
			return true;
		}
		return false;
	}

	public boolean isSpaceName(String name, int idx)
	{
		String nameTrim = name.trim();
		int blankIdx = nameTrim.indexOf(" ", idx);
		if (nameTrim.indexOf(" ", blankIdx)==0) {
			return true;
		} else return isSpaceName(name, blankIdx+1);
	}
	
	public boolean isLowerName(String name)
	{
		String nameTrim = name.trim();
		if (nameTrim.charAt(0)>=97 && nameTrim.charAt(0)<=122) {
			return true;
		} else {
			int blankIdx = nameTrim.indexOf(" ");
			return isLowerName(name.substring(blankIdx+1));
		}
	}
	
	public void throwFaultName(String name) throws Validation {
		if (name.isBlank()) {
			throw new Validation("Name must not be blank!");
		} else if (isSpaceName(name, 0)) {
			throw new Validation("Name must not be space!");
		} else if (isLowerName(name))
		{
			throw new Validation("Name must not be lower!");
		}
	}

	public void throwFaultID(int ID) throws Validation {
		if (ID < 1) {
			throw new Validation("ID is not negative!");
		} else if (isDupplicatedID(ID)) {
			throw new Validation("ID is dupplicated!");
		} 
	}

	public void throwFaultPhone(String phone) throws Validation {
		if (isWrongPhone(phone)) {
			throw new Validation("Phone must not contain letters!");
		} else if (isDupplicatedPhone(phone)) {
			throw new Validation("Phone is dupplicated!");
		}
	}
}
