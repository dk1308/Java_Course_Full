import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {
	public static void main(String[] args) {
		Deque<String> danhSach = new ArrayDeque<String>();
		danhSach.offer("Khoa");
		danhSach.offer("Nhu");
		danhSach.offer("Giang");
		danhSach.offer("Z");
		danhSach.offerLast("HA");		//		offerLast va offerFirst chi co o Deque
		danhSach.offerFirst("Huy");

		
//		ham peek
		System.out.println("peek---");
		for(int i = 0; i<4;i++)
		{
			String s = danhSach.peek();
			System.out.println(s);
		}
		
//		ham poll
		System.out.println("poll---");
		while(danhSach.isEmpty()==false)
		{
			String s = danhSach.poll();
			System.out.println(s);
		}
	}
}
