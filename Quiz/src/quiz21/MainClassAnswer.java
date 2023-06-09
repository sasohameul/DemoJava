package quiz21;

import java.io.*;
import java.util.*;

public class MainClassAnswer {

	
	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>(); //저장할 리스트
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\주택도시보증공사_전국 평균 분양가격.csv";
		
		try(BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(path) , "EUC-KR"))){
			
			br.readLine(); // (제목행) 한번 넘어감
			String str;
			while( (str = br.readLine()) !=null){
				
				String[] arr = str.split(",", 5);
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace(",", "").replace("\"","").replace("-", "");
				//쌍따옴표는 \"
				price = price.equals("") ? "0" : price; //공백이라면, "0"대입  : 그대로
				
				System.out.println( Integer.parseInt(price));
				
				Data data = new Data(region, size, year,month,price);
				list.add(data);
				
			}
			
			System.out.println(list.size());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
	
