import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.crypto.Data;

public class TimeFunction {
	public static void main(String[] args) {
//		Hàm System.currentTimeMillis() -> Lấy thời gian hiện tại
		System.out.println("---System.currentTimeMillis()---");
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("t1= "+t1);
		System.out.println("t2= "+t2);
		System.out.println("Thời gian thực thi: "+(t2-t1)+" mls");
		System.out.println();
		
//		Hàm TimeUnit -> Chuyển đổi đơn vị 
		System.out.println("---TimeUnit---");
//		long s = TimeUnit.HOURS.toSeconds(500);
//		long ml1 = TimeUnit.DAYS.toMillis(10);
//		long ml2 = TimeUnit.MINUTES.toMillis(600);
//		System.out.println("500 giờ = "+s+" s");
//		System.out.println("10 ngày = "+ml1+" mls");
//		System.out.println("600 phút = "+ml2+" mls");
		System.out.println();
		
//		Class Date -> Quản lí thời gian
		System.out.println("---Class Date---");
		java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
		System.out.println("Hôm nay: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		System.out.println();
		
//		Class Calendar -> Quản lí lịch
		System.out.println("---Class Calendar---");
		Calendar c = Calendar.getInstance();
		System.out.println("Hôm nay: "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 30);
		System.out.println("30 tiếng sau cách ngày nay: "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		c.add(Calendar.HOUR, -30);
		c.add(Calendar.DATE, 14);
		System.out.println("Hôm nay cách ly, ngày về sẽ là: "+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
		System.out.println();

//		Class DateFormat -> Định dạng cho thời gian
		System.out.println("---Class DateFormat---");
		DateFormat df = new SimpleDateFormat();
		System.out.println("Ban đầu: "+df.format(d));
		df = new SimpleDateFormat("dd/MM/yyyy H:m:s");
		System.out.println("Sau khi chỉnh sửa: "+df.format(d));
	}

}
