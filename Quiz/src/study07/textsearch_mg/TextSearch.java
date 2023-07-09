package study07.textsearch_mg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Count {
	
	public Count() {

	
	}
	
	public int countWordOccurrencesInDirectory(String directory, String word){
		
		int count = 0;
		
		try {
			
			String path = "";
			
			BufferedReader br = new BufferedReader(new FileReader(directory));
			
			
			File fileAll = new File(path);
			File[] list = fileAll.listFiles();
			
			String aLine="";
			for(File f : list) {
				
				while((aLine = br.readLine()) != null) {
					
					
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		return count;
		
	}
	
	
	
}








public class TextSearch {

	public static void main(String[] args) {

	}

}
