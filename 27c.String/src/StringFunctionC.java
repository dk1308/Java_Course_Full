
public class StringFunctionC {
	public static void main(String[] args) {
		String str1 = "Trường THPT Nguyễn Trãi";
		String str2 = "Trường";
		String str3 = "THPT";
		char c1 = 'T';
//		Hàm indexOf()
		System.out.println("---indexOf()---");
		System.out.println("Vị trí str2 tại str1: "+ str1.indexOf(str2));
		System.out.println("Vị trí str3 tại str1: "+ str1.indexOf(str3));
		System.out.println("Vị trí c1 tại str1: "+ str1.indexOf(c1));
		
		System.out.println("Vị trí c1 tại str1 từ vị trí 8 trở đi: "+str1.indexOf(c1,8));
		System.out.println();
//		Hàm lastIndexOf()
		System.out.println("---lastIndexOf---");
		System.out.println("Vị trí str2 tại str1 từ phải qua: "+ str1.lastIndexOf(str2));
		System.out.println("Vị trí c1 tại str1 từ phải qua: "+str1.lastIndexOf(c1));
	}
}
