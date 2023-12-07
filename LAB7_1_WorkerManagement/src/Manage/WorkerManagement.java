package Manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Extra.Inputter;

public class WorkerManagement {
	ArrayList<Worker> wl = new ArrayList<>();
	ArrayList<Worker> el = new ArrayList<>();
	
	Inputter i = new Inputter();
	public void addWorker() {
		String newId;
		do {
			newId = i.inputNotBlank("Nhập id công nhân");
			if (isDupplicated(newId)) 
				System.err.println("Trùng ID, vui lòng nhập lại!");
		} while (isDupplicated(newId));
		String newName = i.inputNotBlank("Nhập tên công nhân");
		int newAge = i.inputNumber("Nhập tuổi công nhân", 18, 50);
		double newSalary = i.inputNumber("Nhập lương công nhân", 1, Double.MAX_VALUE);
		Worker w = new Worker(newId, newName, newAge, newSalary);
		wl.add(w);
		System.out.println("Thêm công nhân mới thành công!");
	}
	
	public void upSalary() {
		String id;
		Worker tWorker = new Worker();
		do {
			id = i.inputNotBlank("Nhập id công nhân cần tăng lương");
			try {
				tWorker = searchWorker(id).clone();
				if (isNotExist(id)) {
					System.err.println("Không có id này trong danh sách, vui lòng nhập lại!");
					throw new CloneNotSupportedException();
				}
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		} while (isNotExist(id));
		double sal = i.inputNumber("Nhập lương mới", tWorker.getSalary(), Double.MAX_VALUE);
		updateSalary(id, sal);
		tWorker.setSalary(sal);
		tWorker.setSalStatus("UP");
		el.add(tWorker);
	}
	
	public void downSalary() {
		String id;
		Worker tWorker = new Worker();
		do {
			id = i.inputNotBlank("Nhập id công nhân cần giảm lương");
			try {
				tWorker = searchWorker(id).clone();
				if (isNotExist(id)) {
					System.err.println("Không có id này trong danh sách, vui lòng nhập lại!");
					throw new CloneNotSupportedException();
				}
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		} while (isNotExist(id));
		double sal = i.inputNumber("Nhập lương mới", 1, tWorker.getSalary());
		updateSalary(id, sal);
		tWorker.setSalary(sal);
		tWorker.setSalStatus("DOWN");
		el.add(tWorker);
	}
	
	public boolean isDupplicated(String id) {
		for (Worker w : wl) {
			if (id.equals(w.getId())) 
				return true;
		}
		return false;
	}
	
	public boolean isNotExist(String id) {
		for (Worker w : wl) {
			if (id.equals(w.getId())) 
				return false;
		}
		return true;
	}
	
	public Worker searchWorker(String id) {
		for (Worker w : wl) {
			if (id.equals(w.getId())) 
				return w;
		}
		return null;
	}
	
	public void displaySalHistory() {
		sortListWorker(el);
		for (Worker w : el) {
			System.out.println(w);
		}
	}
	
//	public void displayAllWorker()
//	{
//		sortListWorker(wl);
//		for (Worker w : this.wl) {
//			System.out.println(w);
//		}
//	}
	
	public void sortListWorker(ArrayList<Worker> l)
	{
		Collections.sort(l, new Comparator<Worker>() {
			@Override
			public int compare(Worker o1, Worker o2) {
				// TODO Auto-generated method stub
				return o1.getId().compareTo(o2.getId());
			}
		});;
	}
	
	public void updateSalary(String id, double sal) {
		for (Worker w : this.wl) {
			if (id.equals(w.getId())) w.setSalary(sal);
		}
		System.out.println("Cập nhật lương thành công!");
	}
}
