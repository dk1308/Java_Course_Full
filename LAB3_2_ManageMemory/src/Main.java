import java.util.Date;
import java.util.Random;

public class Main {
	public static FuMemoryCached fuMemoryCached = new FuMemoryCached();
	public static Date currentD = new Date(System.currentTimeMillis());

	public static void main(String[] args) {
		Student std1 = new Student("Khoa", 20);
		Student std2 = new Student("Tài", 20);
		Student std3 = new Student("Hùng", 21);
		Student std4 = new Student("Ánh", 19);
		Student std5 = new Student("Hoàng", 22);
		Student [] std = new Student[] {std1, std2, std3, std4, std5};
	
		
		for (int i = 0; i < std.length; i++) {
			fuMemoryCached.putObject(i+"", std[i], 50+i);  /*Thêm từng student vào HashMap*/
		}
		
		while(!fuMemoryCached.cache.isEmpty())
		{
			System.out.println();
			System.out.println("**************************");
			
			Random rd = new Random();
			int rdVal = rd.nextInt(5); /*Khởi tạo giá trị random để lấy ngẫu nhiên student từ HashMap*/
			
			displayAll(); 
			
			fuMemoryCached.getObject(rdVal+""); /*Lấy student từ key random, nếu student hết hạn thì xóa*/
			
			if (fuMemoryCached.cache.isEmpty()) {
				System.out.println("Chương trình kết thúc!");
				break; 
			}
		}
	}


	public static void displayAll() {
		for (Object object : fuMemoryCached.cache.values()) {
			System.out.println(object);
		}
	}
}
