import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Inputter ip = new Inputter();
		int size = ip.inputNumber("Nhập số lượng person", 1, 10);
		
		Person p = new Person();
		Person list[] = new Person[size];
		System.out.println("Quản lí chương trình Person");
		
		for (int i = 0; i < size; i++) {
			System.out.println("Nhập thông tin person");
			Person newP = p.inputPersonInfo();
			list[i] = newP;
		}
		
		for (int i = 0; i < size; i++) {
			System.out.println("\nThông tin person bạn vừa nhập: ");
			p.displayPersonInfo(list[i]);
		}
		
		System.out.println("\n\nSau khi sắp xếp");
		p.sortBySalary(list);
		for (int i = 0; i < size; i++) {
			System.out.print("\nPerson "+(i+1)+":\n");
			p.displayPersonInfo(list[i]);
		}
	}
}
