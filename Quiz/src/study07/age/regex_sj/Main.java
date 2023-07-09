package study07.age.regex_sj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Person {

	String name;
	int age;

	public Person() {

	}

	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;		
		
	}

}

public class Main{

	public static void main(String[] args) throws IOException{

		//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\study07\\age\\regex_sj\\text.txt"));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rccar\\OneDrive\\바탕 화면\\박수정\\"));
		
				
		ArrayList<Person> list= new ArrayList<>();
		
		String line = "";
		String namePattern = "[가-힣]+(는|은)";
		
		String agePattern = "[0-9]{2}";
		
		while((line = br.readLine()) != null) {
		
			Matcher m = Pattern.compile(namePattern).matcher(line);			
						
			Matcher m2 = Pattern.compile(agePattern).matcher(line);
			
			while(m.find() && m2.find()) {
				
					String name = m.group();
					//한꺼번에 안되나????오..된다.
					String real = m.group().replace("는", "").replace("은", "");
													
					//System.out.println(real +" "+  m2.group());
					
					//리스트에 객체의 파라미터를 담는법..
					list.add(new Person(real , Integer.parseInt(m2.group())));
					
			}
			
		}
		
		List<Person> list2= list.stream().filter(b -> b.age >= 50 ).collect(Collectors.toList());
		//객체를 담은 리스트를 사용하는법... 아직 익숙치않다.
		for(Person p : list2) {
			
			System.out.println(p.name + " : " + (2024 - (1900+p.age)) + "년생");
			//System.out.println(p.age);
			
		}


	}

}






