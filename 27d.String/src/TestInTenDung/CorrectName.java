package TestInTenDung;

import java.util.Arrays;
import java.util.Iterator;

public class CorrectName {

	public void returnCorrectName(String ten)	
	{
		String trimTen = ten.trim();
		String lowerTen = trimTen.toLowerCase();
		String[] strTen = lowerTen.split("");
		int count=0;
		
		for (int i = strTen.length-1; i>=0 ; i--) {
			if(strTen[i].compareTo(" ")==0 && strTen[i-1].compareTo(" ")==0)
			{
				for(int j=i;j+1<strTen.length ;j++)
				{
					strTen[j]=strTen[j+1];
				}
				count++;
			}
		}
		
		strTen[0] = strTen[0].toUpperCase();
		for (int i = 1; i < strTen.length; i++) {
			if (strTen[i].compareTo(" ")==0) {
				strTen[i+1] = strTen[i+1].toUpperCase();
				i+=2;
			}
		}
		
		String[] tenFinal = new String[strTen.length - count];
		System.arraycopy(strTen, 0, tenFinal, 0, tenFinal.length);
		
		for (int i = 0; i < tenFinal.length; i++) {
			System.out.print(tenFinal[i]);
		}
		 
		System.out.println();
}
}
