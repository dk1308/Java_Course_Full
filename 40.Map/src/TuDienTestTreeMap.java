import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TuDienTestTreeMap {
	private Map<String, String> td = new TreeMap<String,String>();
	
	public TuDienTestTreeMap(Map<String, String> td) {
		this.td = td;
	}
	public TuDienTestTreeMap() {
		
	}
	
	public void themTu(String k, String v)
	{
		this.td.put(k, v);
	}
	
	public void xoaTu(String k, String v)
	{
		this.td.remove(k,v);
	}
	
	public String traTu(String k)
	{
		return this.td.get(k);	
	}
	
	public void inTuKhoa() {
		Set<String> dsKey = new TreeSet<>();
		dsKey = td.keySet();
		System.out.println(Arrays.toString(dsKey.toArray()));
	}
	
	public int laySoLuong()
	{
		return this.td.size();
	}
	
	public void xoaTatCa()
	{
		td.clear();
	}
	
	public void inTuDien()
	{
//		for ( String k : this.td.keySet()) {
//			System.out.println(k+": "+ this.td.get(k));
//		}
		Set<Map.Entry<String, String>> dsSet = td.entrySet();
		System.out.println(Arrays.toString(dsSet.toArray()));
	}


	public static void main(String[] args) {
		TuDienTestTreeMap td = new TuDienTestTreeMap();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		
		do {
			System.out.println("---------------");
			System.out.println("MENU ");
			System.out.println("Tra từ điển Anh - Việt:\n"
					+ "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
					+ "2. Xóa từ\n"
					+ "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
					+ "4. In ra danh sách từ khóa\n"
					+ "5. Lấy số lượng từ\n"
					+ "6. Xóa tất cả các từ khóa\n"
					+ "7. In từ điển\n"
					+ "0. Thoát khỏi chương trình\n"
					+ "");
			System.out.println("Nhập lựa chọn: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Thêm từ.");
				System.out.println("Nhập từ khóa: ");
				String k = sc.nextLine();
				System.out.println("Nhập giá trị: ");
				String v = sc.nextLine();
				td.themTu(k, v);
				break;
			}
			case 2: {
				System.out.println("Xóa từ.");
				System.out.println("Nhập từ khóa: ");
				String k = sc.nextLine();
				System.out.println("Nhập giá trị: ");
				String v = sc.nextLine();
				td.xoaTu(k, v);
				break;
			}
			case 3: {
				System.out.println("Tra từ.");
				System.out.println("Nhập từ cần tra: ");
				String k = sc.nextLine();
				System.out.println(k+": "+td.traTu(k));
				break;
			}
			case 4: {
				System.out.println("In ra danh sách từ khóa.");
				td.inTuKhoa();
				break;
			}
			case 5: {
				System.out.println("Lấy số lượng từ.");
				System.out.println("Số lượng từ: "+ td.laySoLuong());
				break;
			}
			case 6: {
				System.out.println("Xóa tất cả từ.");
				td.xoaTatCa();
				break;
			}
			case 7: {
				System.out.println("In tất cả từ.");
				td.inTuDien();
				break;
			}
			default:
				System.out.println("Chương trình kết thúc! ");
				break;
			}
		} while (choice!=0);
		
	}
	
}
