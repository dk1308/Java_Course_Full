package Input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Inputter {

//	Nhập dữ liệu số thực
	public double inputDouble(String msg, double min, double max) {
		Scanner sc = new Scanner(System.in);
		double f;
		do {
			System.out.println(msg);
			f = sc.nextDouble();
		} while (f < min || f > max);
		return f;
	}

// 	Nhập dữ liệu số nguyên	
	public int inputInt(String msg, int min, int max) {
		Scanner sc = new Scanner(System.in);
		int r;
		do {
			System.out.println(msg);
			r = sc.nextInt();
		} while (r < min || r > max);
		return r;
	}



//	Input theo khuôn mẫu
	public String inputPattern(String msg, String pattern) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String str =sc.nextLine();
		if (!str.matches(pattern)) {
			do {
				System.out.println("Mã nhân viên không đúng format (phải bắt đầu MNV và có 6 ký tự)!");
				System.out.println(msg);
				str = sc.nextLine();
			} while (!str.matches(pattern));
		}
		return str;
	}

//	Input ngày phải trước ngày hiện tại
	public Date inputDate(String msg) {
		Date current_date = new Date(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		String str_date = sc.nextLine();
		java.util.Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(str_date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (date.after(current_date)) {
			do {
				System.out.println("Ngày vào công ty phải nhỏ hơn ngày hiện tại!");
				System.out.println(msg);
				str_date = sc.nextLine();
				try {
					date = new SimpleDateFormat("dd/MM/yyyy").parse(str_date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} while (date.after(current_date));
		}
		return date;
	}

//	Input 1 chuỗi khác chuỗi rỗng
	public String inputNonBlank(String msg) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.println(msg);
			str = sc.nextLine();
		} while (str.isBlank());
		return str;
	}
}
