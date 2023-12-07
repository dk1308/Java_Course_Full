import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> danhSach = new LinkedList<String>();
		danhSach.add("Khoa");
		danhSach.add("Nhu");
		danhSach.offer("Giang");
		danhSach.offer("Bao");
		
		while(danhSach.isEmpty()==false)
		{
			String s = danhSach.poll();
			System.out.println(s);
		}
	}
}
