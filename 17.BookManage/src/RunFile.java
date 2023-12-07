import java.util.Scanner;

public class RunFile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		Lop Ngay Sinh	
		NgaySinh ngay1 = new NgaySinh(13, 8, 2003);
		NgaySinh ngay2 = new NgaySinh(15, 9, 2003);
		
//		Lop Tac Gia
		TacGia tg1 = new TacGia("Khoa Dang", ngay1);
		TacGia tg2 = new TacGia("Tuan Pham", ngay2);
		
		
		
//		Lop Quan Li Sach		
		BookManage inf1 = new BookManage("Toi thay hoa vang tren "
				+ "co xanh", 2010, 50000, tg1);
		BookManage inf2 = new BookManage("Quan go di len", 2010, 
				80000, tg1);
		BookManage inf3 = new BookManage("Toi la beto", 2014, 
				60000, tg2);
		
		
		
//		1. In ten sach
		System.out.println(inf3.getN());
		inf1.namePrint();
		
//		2. So sanh nam xuat ban 
		System.out.println("Sach 1 co cung nam xuat ban voi sach 2:"
				+ " "+ inf1.equals(inf2));
		System.out.println("Sach 1 co cung nam xuat ban voi sach 3:"
				+ " "+ inf1.equals(inf3));
		
//		3. Gia sach sau khi duoc giam
		System.out.println("Nhap % giam gia: ");
		int sale = sc.nextInt();
		System.out.println("Gia sach 1 sau khi duoc giam "+ sale+"% la: "
		+(int)inf1.priceAfterSale(sale));
	}
}
