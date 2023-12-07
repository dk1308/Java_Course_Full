import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckFormat {
	Scanner sc = new Scanner(System.in);

//		Hàm kiểm tra số điện thoại
	public void checkPhone() {
		String phone;
		while (true) {
			System.out.print("Nhập số điện thoại: ");
			phone = sc.nextLine();
			if (!phone.matches("[0-9]+")) {
				System.out.println("Số điện thoại phải là số!");
				continue;
			}
			if (phone.length() != 10) {
				System.out.println("Số điện thoại phải là 10 chữ số!");
				continue;
			}
			System.out.println("Nhập số điện thoại thành công!\n\n");
			break;
		}
	}

//		Hàm kiểm tra email
	public void checkEmail() {
		String email;
		while (true) {
			System.out.print("Nhập email: ");
			email = sc.nextLine();
			if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z]+(.{1}[A-Za-z])*.[A-Za-z]+$")) {
				System.out.println("Email phải đúng format (abc@gmail.com) !");
				continue;
			}
			System.out.println("Nhập email thành công!\n\n");
			break;
		}
	}

//		Hàm kiểm tra ngày
	public void checkDate() {
		String s;
		Date date;
		while (true) {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			try {
				System.out.print("Nhập ngày tháng: ");
				s = sc.nextLine();
				date = df.parse(s);
				if (!df.format(date).equals(s)) {
					throw new Exception();
				}
				System.out.println("Nhập ngày thành công!\n\n");
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Phải nhập ngày tháng đúng format(dd/MM/yyyy)!");
			}
		}
	}
}
