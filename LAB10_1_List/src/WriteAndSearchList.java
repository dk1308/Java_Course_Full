import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;

public class WriteAndSearchList {
	Inputter input = new Inputter();
	
//	Main function 1
	public void function1() throws ValidDateException {
		while (true) {
			String strF = "";
			try {
				strF = input.inputNotBlank("Nhập đường dẫn file");
			} catch (ValidDateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File f = new File(strF);
			
			StringBuilder contentF = new StringBuilder();
			try {
				contentF = readFile(f);
				if (contentF.isEmpty()) throw new Exception();
			} catch (Exception e) {
				System.err.println("File trống hoặc không tồn tại! Vui lòng nhập lại");
				continue;
			}
			
//			if (contentF.isEmpty()) {
//				System.err.println("File trống! Vui lòng nhập lại.");
//				continue;
//			}
			
			String strSearch="";
			try {
				strSearch = input.inputNotBlank("Nhập từ");
			} catch (ValidDateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int result = countWord(contentF, strSearch);
			
			System.out.println("Kết quả: "+result);
			break;
		}
	}
	
//	Main function 2
	public void function2() {
		while (true) {
			String strFol = "";
			try {
				strFol = input.inputNotBlank("Nhập đường dẫn folder");
			} catch (ValidDateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File fol = new File(strFol);
			
			if (fol.listFiles()==null) {
				System.err.println("Folder trống hoặc không tồn tại! Vui lòng nhập lại.");
				continue;
			}
			
			String strSearch="";
			try {
				strSearch = input.inputNotBlank("Nhập từ");
			} catch (ValidDateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArrayList<String> result = new ArrayList<>();
			result = findFile(fol, strSearch);
			System.out.println("Kết quả: "+result);
			break;
		}
	}
	
	StringBuilder readFile(File f) {
		StringBuilder str = new StringBuilder();
		BufferedReader br = null;
		try {
			br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
		}
		while (true) {
			try {
				String line = "";
				line = br.readLine();
				if (line == null) break;
				str.append(line+"\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("keke");
				e.printStackTrace();
			}
		}
		return str;
	}
	
	int countWord(StringBuilder str, String search) {
		int count = 0;
		int i = 0;
		while(true) {
			int index = str.indexOf(search,i);
			if (index>=0) {
				count++;
				i=index+1;
			} else break;
		}
		return count;
	}
	
	ArrayList<String> findFile(File folder, String word) {
		ArrayList<String> result = new ArrayList<>();
		StringBuilder contentFile = new StringBuilder();
		File[] listFile = folder.listFiles();
		for (File file : listFile) {
			contentFile = readFile(file);
			if (contentFile.indexOf(word)>=0) result.add(file.getName());
		}
		return result;
	}
	
}
