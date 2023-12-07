package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.AbstractDocument.BranchElement;

public class StaffList {
	public ArrayList<Staff> listOfStaff = new ArrayList<>();
	
	public StaffList()
	{
		File f = new File("C:\\Users\\ADMIN\\OneDrive\\Tài liệu\\FPT courses\\PRO\\PE\\staff.txt");
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String lineStaff;
			while((lineStaff=br.readLine())!= null)
			{	
				String[] arrStaff = lineStaff.split(":");
				Staff newStaff = new Staff(arrStaff[0],arrStaff[1],arrStaff[2],arrStaff[3]);
				this.listOfStaff.add(newStaff);	
			}
			
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public ArrayList searchStaffByName(String name)
	{
		ArrayList<Staff> listSearch = new ArrayList<>();
		for (Staff staff : listSearch) {
			if (staff.getName().contains(" "+name)||staff.getName().contains(name+" ")) {
				listSearch.add(staff);
			}
		}
		return listSearch;
	}
	
	public ArrayList searchStaffByDepartment(String department)
	{
		ArrayList<Staff> listSearch = new ArrayList<>();
		for (Staff staff : listSearch) {
			if (staff.getDepartment().equals(department)) {
				listSearch.add(staff);
			}
		}
		return listSearch;
	}
	
	public ArrayList searchStaffById(String id)
	{
		ArrayList<Staff> listSearch = new ArrayList<>();
		for (Staff staff : listSearch) {
			if (staff.getId().equals(id)) {
				listSearch.add(staff);
			}
		}
		return listSearch;
	}
	
	public void removeStaff(String id)
	{
		for (Staff staff : listOfStaff) {
			if (staff.getId().equals(id)) {
				this.listOfStaff.remove(staff);	
				break;
			}
		}
		
	}
	
	

}
