import java.io.File;
import java.util.Scanner;

public class ViDuFile {
	File file;

	public ViDuFile(File file) {
		this.file = file;
	}
	
	public boolean kiemTraThucThi()
	{
		return this.file.canExecute();
	}
	
	public boolean kiemTraDoc()
	{
		return this.file.canRead();
	}
	
	public boolean kiemTraGhi()
	{
		return this.file.canWrite();
	}
	
	public void inDuongDan()
	{
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void inTen()
	{
		System.out.println(this.file.getName());
	}
	
	public void kiemTraFolderHayFile()
	{
		if (this.file.isDirectory()) {
			System.out.println("Day la thu muc!");
		}else System.out.println("Day la file!");
	}
	
	public void inFileCon()
	{
		String[] fs = this.file.list();
		for (int i = 0; i < fs.length; i++) {
			System.out.println(fs[i]);
		}
	}
	
	
//	Important
	public void inTreeFolder(File f, int bac)
	{
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead() && f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for ( File fCon : mangCon ) {
				inTreeFolder(fCon, bac+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = new File("D:\\Dev\\JavaCourse\\43.FileAndFolder2");
		ViDuFile vdf = new ViDuFile(f);
		int choice=0;
		
		do {
			System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");
			System.out.println("2. Kiểm tra file có thể đọc: ");
			System.out.println("3. Kiểm tra file có thể ghi: ");
			System.out.println("4. In đường dẫn: ");
			System.out.println("5. In tên file: ");
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7. In ra danh sách các file con: ");
			System.out.println("8. In ra cây thư mục: ");
			System.out.println("0. Thoát chương trình.");
			System.out.println("Nhập lựa chọn: ");
			choice =sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("Kiểm tra file có thể thực thi.");
				System.out.println("File có thể thực thi: "+vdf.kiemTraThucThi());
				break;
			case 2:
				System.out.println("Kiểm tra file có thể đọc.");
				System.out.println("File có thể đọc: "+vdf.kiemTraDoc());
				break;
			case 3:
				System.out.println("Kiểm tra file có thể ghi.");
				System.out.println("File có thể ghi: "+vdf.kiemTraGhi());
				break;
			case 4:
				System.out.println("In đường dẫn.");
				vdf.inDuongDan();
				break;
			case 5:
				System.out.println("In tên file.");
				vdf.inTen();
				break;
			case 6:
				System.out.println("Kiểm tra file là thư mục hoặc tập tin.");
				vdf.kiemTraFolderHayFile();
				break;
			case 7:
				System.out.println("In ra danh sách các file con.");
				vdf.inFileCon();
				break;
			case 8:
				System.out.println("In ra cây thư mục.");
				int bac = 0;
				vdf.inTreeFolder(f, bac);
				break;
			default:
				break;
			}
		} while (choice!=0);
		
		
	}
	
}
