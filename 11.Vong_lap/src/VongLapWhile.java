import java.util.Scanner;

public class VongLapWhile {
	
	public static void main(String[] args) {
		int b=0;
		String ketqua="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap 1 so thap nhan: ");
		int a = sc.nextInt();
		
		while(a>0) {
			b= a%2;
			ketqua = b+ketqua;
			a/=2;
		}
		
		System.out.println("Ket qua: "+ketqua);
		
}
}
