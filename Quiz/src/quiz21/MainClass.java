package quiz21;

import java.io.*;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		//지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개 (1행에 객체를 저장한다) List<객체>
		
		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽습니다.
		 * 2. split(",", 5);을 사용해서 Data객체에 한줄 단위로 저장하고
		 * 3. List<Data> 에 하나씩 추가를 합니다.
		 * 4. 람다식을 이용해서 (지역: 서울, 4분기중 9~12월, 분양가격: 2000이상)인 객체만 뽑아서
		 * 	  새로운 리스트로 반환
		 * 
		 */
		
		List<Data> list = new ArrayList<>();
		Data d = new Data();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\주택도시보증공사_전국 평균 분양가격.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String result;
			while((result = br.readLine()) != null) {
				
					String[] rs = result.split(",", 5);
					
					for(int i = 0; i < rs.length; i+=5){
						
						d.setRegion(rs[i]);
					}
					
					for(int i = 1; i < rs.length; i+=5) {
						
						d.setSize(rs[i]);
					}
					
					for(int i = 2; i < rs.length; i+=5) {
						
						d.setYear(rs[i]);
					}
					for(int i = 3; i < rs.length; i+=5) {
						
						d.setMonth(rs[i]);
					}
					for(int i = 4; i < rs.length; i+=5) {
						
						d.setPrice(rs[i]);
					}
					
									
					list.add(d.getRegion());
					list.add(d.getSize());
					list.add(d.getYear());
					list.add(d.getMonth());
					list.add(d.getPrice());
					
				List<String> newlist = (List<String>) list.stream().filter(a -> d.getRegion().equals("서울") && d.getMonth().contains("9") );
				System.out.println(newlist.toString());
				
			}
			
			
		} catch (Exception e) {
			
		}{
			
		}
		
		
	}

}
