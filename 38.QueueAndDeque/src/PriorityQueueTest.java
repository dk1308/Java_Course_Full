import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		Queue<String> danhSach = new PriorityQueue<String>();
		danhSach.add("Khoa");
		danhSach.add("Nhu");
		danhSach.add("Giang");
		danhSach.add("Dung");
		
		System.out.println("Danh sach theo thu tu tang dan: ");
		while (danhSach.isEmpty()==false) {
			String s = danhSach.poll();
			System.out.print(s+" - ");
		}
	}
}
