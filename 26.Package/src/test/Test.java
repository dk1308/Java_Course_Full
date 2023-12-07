package test;

import code_a.ViDu;

public class Test {
	public static void main(String[] args) {
		ViDu vda = new ViDu(1, 2);
		code_b.ViDu vdb= new code_b.ViDu(4, 5, 6);
		
		System.out.println("Package a: a= "+ vda. getA());
		System.out.println("Package b: a= "+ vdb.getA());
		
	}
}
