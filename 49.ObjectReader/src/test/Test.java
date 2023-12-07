package test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int choice = 0;
		String mssv, hoVaTen;
		int tuoi;
		double diem;
		
		do {
			System.out.println("\nMENU-------");
			System.out.println("1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "10.	Lưu danh sách sinh viên xuống file.\n"	
					+ "11.	Đọc danh sách sinh viên từ file.\n"	
					+ "0.   Thoát khỏi chương trình");
			System.out.println("Nhập lựa chọn: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("---Thêm sinh viên---");
				
				System.out.println("Nhập mã số sinh viên: "); mssv = sc.next();
				System.out.println("Nhập tên sinh viên: "); hoVaTen = sc.next();
				System.out.println("Nhập tuổi sinh viên: "); tuoi = sc.nextInt();
				System.out.println("Nhập điểm sinh viên: "); diem = sc.nextDouble();
				
				SinhVien sv= new SinhVien(mssv, hoVaTen, tuoi, diem);
				dssv.themSinhVien(sv);
				break;
			case 2:
				System.out.println("---In danh sách---");
				dssv.inDanhSach();
				break;
			case 3:
				System.out.println("---Kiểm tra danh sách rỗng---");
				if (dssv.checkEmpty()==true) {
					System.out.println("Danh sách sinh viên rỗng ");
				}else 
					System.out.println("Danh sách sinh viên không rỗng ");
				break;
			case 4:
				System.out.println("---Lấy số lượng  sinh viên---");
				System.out.println("Số lượng sinh viên có trong danh sách: "+dssv.getSize());
				break;
			case 5:
				System.out.println("---Làm rỗng danh sách sinh viên---");
				dssv.emptyDanhSach();
				break;
			case 6:
				System.out.println("---Kiểm tra sinh viên tồn tại trong danh sách---");
				System.out.println("Nhập mssv cần kiểm tra: "); mssv = sc.next();
				SinhVien sv2 = new SinhVien(mssv);
//				System.out.println(dssv.checkExist(sv2));
				if(dssv.checkExist(sv2)==true )
				System.out.println("--> Sinh viên có trong danh sách!");
				else System.out.println("--> Sinh viên không có trong danh sách!");
				break;
			case 7:
				System.out.println("---Xóa một sinh viên ra khỏi danh sách---");
				System.out.println("Mssv của sinh viên cần xóa là: "); mssv = sc.next();
				SinhVien sv3 = new SinhVien(mssv);
				System.out.println("Đã xóa: "+dssv.removeSV(sv3));
				break;
			case 8:
				System.out.println("---Tìm kiếm sinh viên---");
				System.out.println("Tên của sinh viên cần tìm kiếm là: "); hoVaTen = sc.next();
				dssv.searchSV(hoVaTen);
				break;
			case 9:
				System.out.println("---Sắp xếp sinh viên theo điểm trung bình---");
				dssv.sortSinhVien();
				break;
			case 10:
				System.out.println("---Lưu danh sách sinh viên xuống file---");
				File fwrite = new File("D:\\Dev\\JavaCourse\\48.ObjectWriter\\file.txt");
				dssv.writeSinhVien(fwrite);
				System.out.println("Đã lưu dssv!");
				break;
//			case 11:
//				System.out.println("---Đọc danh sách sinh viên từ file---");
//				File fread = new File("D:\\Dev\\JavaCourse\\48.ObjectWriter\\file.txt");
//				dssv.readSinhVien(fread);
//				System.out.println("Đã đọc dssv!");
//				break;
			default:
				break;
			}
		} while (choice!=0);
	}
}
