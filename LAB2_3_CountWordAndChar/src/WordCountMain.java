import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class WordCountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
//		Dem tu 
		countWordFunc(str);
		
//		Dem chu cai
		countCharFunction(str);
	}
	
	
	private static void countWordFunc(String str)
	{
		LinkedHashMap<String, Integer> countWordMap = new LinkedHashMap<>();
		String[] word = str.split("\\s+");
		ArrayList<String> usedWord = new ArrayList<>();
		
		for (int i = 0; i < word.length; i++) {
			int countWord=0;
			for (int j = i; j < word.length; j++) {
				if (word[i].equalsIgnoreCase(word[j]) && !isUsed(word[i], usedWord)) {
					countWord++;
				}/* Neu chua duoc su dung thi dem*/ 
			}
			
			if (!isUsed(word[i], usedWord)) {
				countWordMap.put(word[i], countWord);
				usedWord.add(word[i]);
			}/* Neu chua duoc su dung thi them vao map va them vao mang cac tu da su dung*/
		}
		
		System.out.println(countWordMap);
	}
	
	
	private static void countCharFunction(String str)
	{
		LinkedHashMap<String, Integer> countCharMap = new LinkedHashMap<>();
		ArrayList<String> usedChar = new ArrayList<>();
		usedChar.add(" ");
		String[] character = str.split("(?!^)");
		
		for (int i = 0; i < str.length(); i++) {
			int countChar = 0;
			for (int j = i; j < str.length(); j++) {
				if (character[i].equalsIgnoreCase(character[j]) && !isUsed(character[i], usedChar)) {
					countChar++;
				}/* Neu chua duoc su dung thi dem*/ 	
			}
			if (!isUsed(character[i], usedChar)) {
				countCharMap.put(character[i], countChar);
				usedChar.add(character[i]);
			} /* Neu chua duoc su dung thi them vao map va them vao mang cac tu da su dung*/
		}
		System.out.println(countCharMap);
	}
	
	
//	Ham kiem tra tu hay chu cai da duoc su dung chua
	private static boolean isUsed(String str, ArrayList<String> usedWord)
	{
		for (String string : usedWord) {
			if (str.equalsIgnoreCase(string)) {
				return true;
			}
		}
		return false;
	}
}
