package quiz22;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {
	
	public static void main(String[] args) {
		
		}
		
	public static void createExcel(List<Product> list1) {
		
		XSSFWorkbook workbook = XSSFWorkbook();			
		//시트
		XSSFSheet sheet = workbook.createSheet();
		//시트안에 행
		XSSFRow row1 = sheet.createRow(0);
		XSSFCell cel1= row1.createCell(0);
		row1.createCell(0).setCellValue("날짜");
		row1.createCell(0).setCellValue("지점");
		row1.createCell(0).setCellValue("등급");
		row1.createCell(0).setCellValue("상세");
		row1.createCell(0).setCellValue("가격");
			
		//리스트를 엑셀파일
		
		for(int i = 0; i < list1.size(); i++) {
			
			XSSFRow row = sheet.createRow(i + 1);
			
			Product p = list1.get(i);// 리스트 안에 객체
			
			row.createCell(0).setCellValue(p.getDay());
			row.createCell(0).setCellValue(p.getStore());
			row.createCell(0).setCellValue(p.getGrade());
			row.createCell(0).setCellValue(p.getDetail());
			row.createCell(0).setCellValue(p.getPrice());
			
		}
		
		
		String path1 = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.xlsx";
		
		// FileOutputStream out = new FileOutputStream(path);
		try( FileOutputStream fos = new FileOutputStream(path1) ) {
			
			workbook.write(fos);
			
		} catch (Exception e) {

		}
	
	
	
		/*
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석해서
		 * 	  Product객체에 저장하고, 리스트에 저장
		 * 3. 외부라이브러리 (POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록하는 기능
		 * 	  하나의 시트에 각 행데이터를 엑셀 파일로 출력
		 * 
		 */
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\quiz22\\건담.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String result;
			
			while((result = br.readLine()) != null) {
				
				//System.out.println(result);
				
				String p1 = "\\d+-\\d+-\\d+";
				Matcher m1 = Pattern.compile(p1).matcher(result);
				
				String p2 ="[가-힣]+\s[가-힣]+"; //[가-힣]+ (강남점|평내호평점|)
				Matcher m2 = Pattern.compile(p2).matcher(result);
				
				String p3 ="\\[[A-Z.가-힣]+\\]";
				Matcher m3 = Pattern.compile(p3).matcher(result);
				
				String p5 ="\\d+,*\\d+원";
				Matcher m5 = Pattern.compile(p5).matcher(result);
				
				if(m1.find() && m2.find() && m3.find() && m5.find()) {
					
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = result.substring(m3.end()+1,m5.start()-1);//공백까지 없애기위해 +-1
					String price = m5.group();
					
					//1행을 Product객체에 저장
					Product p = new Product(day,store,grade,detail,price);
					//product를 리스트에 저장
					list.add(p);
					
				}
			} //end of while phrase
			
			
			createExcel(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	private static XSSFWorkbook XSSFWorkbook() {

		return null;
	}
	
}
