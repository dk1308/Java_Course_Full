import java.util.Scanner;

public class RunFile {
	public static void main(String[] args) {
		DayPublic d1 = new DayPublic(15,10,2023);
		DayPublic d2 = new DayPublic(20,10,2025);
		DayPublic d3 = new DayPublic(31,1,2020);
		
		Brand br1 = new Brand("No1","Viet Nam");
		Brand br2 = new Brand("No2", "Spain");
		Brand br3 = new Brand("No3", "Korea");
		
		MovieManage mv1 = new MovieManage("Toi thay hoa vang tren co xanh",2022,br1, 50000, d1);
		MovieManage mv2 =new MovieManage("Money Heist",2024,br2, 60000, d2);
		MovieManage mv3= new MovieManage("Ha canh khan cap",2018,br3, 45000, d3);
		
		System.out.println("Phim 2 re hon phim 1: "+mv1.checkMovieCheaper(mv2));
		System.out.println("Phim 1 re hon phim 2: "+mv2.checkMovieCheaper(mv1));
		System.out.println("Phim 3 re hon phim 1: "+mv1.checkMovieCheaper(mv3));
		
		System.out.println();
		mv1.printBrand();
		mv2.printBrand();
		mv3.printBrand();
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap % giam gia: ");
		double x = sc.nextDouble();
		System.out.println("Gia ve phim 1 sau khi giam "+x+"% la: "+mv1.printPriceAfterSale(x));
		System.out.println("Gia ve phim 2 sau khi giam "+x+"% la: "+mv2.printPriceAfterSale(x));
		System.out.println("Gia ve phim 3 sau khi giam "+x+"% la: "+mv3.printPriceAfterSale(x));
		
	}
}
