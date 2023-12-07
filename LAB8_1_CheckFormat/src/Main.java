
public class Main {
	public static void main(String[] args) {
		CheckFormat cf = new CheckFormat();
		System.out.println("===Validate Program===\n");
		
		cf.checkPhone(); /*Kiem tra sdt*/
		cf.checkEmail(); /*Kiem tra sdt*/
		cf.checkDate(); /*Kiem tra sdt*/
		
		System.out.println("Ket thuc!");
	}
}
