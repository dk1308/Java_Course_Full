import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ConTactCustomer{
	ArrayList<Customer> listCus = new ArrayList<Customer>();

	public ConTactCustomer(ArrayList<Customer> listCus) {
		this.listCus = listCus;
	}
	
	public ConTactCustomer()
	{
		
	}
	
	public void addCus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		String code = sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter phone: ");
		int num = sc.nextInt();
		Customer ct=new Customer(code, name, num);
		this.listCus.add(ct);
	}
	
	public void saveLisCus(File f)
	{
		try {
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (Customer customer : listCus) {
				oos.writeObject(customer);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void editCus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of customer need to edit: ");
		String code = sc.nextLine();
		for (Customer customer : listCus) {
			if(customer.getCode().equals(code))
			{
				System.out.println("Enter new name: ");
				String newName = sc.nextLine();
				customer.setName(newName);
				System.out.println("Enter new phone: ");
				int newPhone = sc.nextInt();
				customer.setPhone(newPhone);
			}
			else {
				System.out.println("Customer "+code+" does not exist!");
			}
		}
	}
	
	public void deleteCus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of customer need to delete: ");
		boolean check = false;
		String code = sc.nextLine();
		for (Customer customer : listCus) {
			if(customer.getCode().equals(code))
			{
				listCus.remove(customer);
				check = true;
				break;
			}
		}
		if (check == true) {
			System.out.println("Delete done!");
		}else System.out.println("Customer "+code+" does not exist!");
	}
	
	public void searchCus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code of customer need to search: ");
		String code = sc.nextLine();
		boolean check = false;
		Customer result = new Customer();
			for (Customer customer : listCus) {
				if(customer.getCode().equals(code))
				{
					result = customer;
					check = true;
					break;
				}
			}
		if (check==true) 
			System.out.println("Customer searched is: "+result);
		else 
			System.out.println("Customer "+code+" does not exist!");
		
	}
	
	public static char getFirstName(Customer t)
	{
		int idxTen = t.getName().trim().lastIndexOf(" ");
		if (idxTen >= 0) {
			return t.getName().charAt(idxTen+1);
		}
		else return t.getName().charAt(0);
	}
	
	public void sortCus()
	{
		Collections.sort(this.listCus, new Comparator<Customer>(){
			@Override
			public int compare( Customer o1, Customer o2) {
				if (getFirstName(o1)< getFirstName(o2)) 
					return -1;
				else if(getFirstName(o1)>getFirstName(o2))
					return 1;
				else return 0;
			}
		});
	}
	
	public void readCus(File f)
	{
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			while (true) {
				Customer ct = (Customer)ois.readObject();
				if (ct == null) 
					break;
				else this.listCus.add(ct);
			}
			
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
	
	public void displayAllCus() {
		for (Customer customer : listCus) {
			System.out.println(customer);
		}
	}
}

