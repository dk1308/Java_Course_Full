import java.awt.font.TextAttribute;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tien ban muon rut: ");
		int tien = sc.nextInt();
		
		Test t = new Test();
		try {
			t.rutTien(tien, 400);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void rutTien(int tien_rut, int tien_stk) throws BankException
	{	
		if (tien_rut >tien_stk) throw new BankException("khong du tien"); 
		else tien_stk-=tien_rut;
	}
}
