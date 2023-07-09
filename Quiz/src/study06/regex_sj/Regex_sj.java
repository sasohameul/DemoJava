package study06.regex_sj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_sj {

	public static void main(String[] args) {

		/*

		String quiz = "단비 학생은 60점입니다 
					   짱구 학생은 55점입니다 
					   짱아 학생은 70점입니다 
					   맹구 학생은 80점 입니다 
					   훈이 학생은 시험을 치루지 않아 0점입니다 
					   유리 학생은 86점입니다 
					   김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";

		/*
		* 주어진 문자열을 이용해 다음과 같이 문제를 풀어보세요!! (정규표현식 ,map 필수사용)
		* 1. 정규 표현식을 이용해서 quiz 문자열을 첨부한 이미지와 같이 나눠주고 출력해줍니다
		* 2. 나눠진 문자열에서 이름과 점수를 <String,Integer> 형태로 map에 담아줍니다
		* 3. 점수가 높은 친구를 순서대로 출력해줍니다 (map 사용)
		* 저는 map에 담아줄 때 list 에 점수 따로 넣어주고 , array 클래스 같이 사용했습니다! (다른 방법으로도 가능합니다!)
		* */
		
		String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 맹구 학생은 80점 입니다 "
				+ "훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 "
				+ "김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";
				
//		String pattern = "^([가-힣]{2,3}\\s[가-힣]+\\s)(?*[가-힣]+)[0-9]{1,3}[가-힣]+$";
//		String pattern = "^([가-힣]{2,3}\\s(.*?)[가-힣]{3}!)$"; 한줄로 나옴
//		String pattern = "[가-힣]{2,3}\\s[가-힣]{3}\\s[0-9]{1,3}[가-힣]{4,5}"; //훈이학생과 김철수학생 출력 안됨
		String pattern = "\\D+ [0-9]{1,3}\\D+다!* ";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(quiz);
		
		String pattern2 = "[0-9]{1,3}";
		Pattern s = Pattern.compile(pattern2);
		Matcher s1 = s.matcher(quiz);	
		
		HashMap<String,Integer> hm = new HashMap<>();
					
		//문장 출력
		while(m.find()) {
			
			String str = m.group();
			System.out.println(str);			
			
			System.out.println("-------------");
//			String score = s1.group();
//			
//			 hm.put(str.substring(0, 2),Integer.parseInt(score));
//			
		}
		
		System.out.println(hm);
		
		//키-값 저장	
				
		
		//이름만 추출
//		String name = "[가-힣]+ 학생";
//		Pattern n = Pattern.compile(name);
//		Matcher na = n.matcher(quiz);
//				
//			//이름 저장할 ArrayList
//			ArrayList list= new ArrayList();
//			
//				while(na.find()) {
//					
//					System.out.println(na.group());					
//					String pname =  na.group();
//						
//						list.add(pname);
//					
//				}
//						
//				String[] onlyname = new String[7];
//				
//				for(int i = 0 ; i < list.size(); i++) {
//					
//					String mm = (String)list.get(i);
//					onlyname[i] = (mm.length() == 5)? mm.substring(0, 2): mm.substring(0, 3);
//					
//				}	
				
		//점수 추출						
		
		ArrayList<Integer> score1 = new ArrayList();
		
//		while(s1.find()) {
//			
//			score1.add(Integer.parseInt(sscore));
//		}	
		
		Collections.reverse(score1);
		
		System.out.println(score1);

		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		
		
		String[] nameorder = new String[7];

		for(int i = 0 ; i < score1.size(); i++) {
			
			for(Entry<String,Integer> entry : entrySet) {
				
				if(score1.get(i) == entry.getValue()) {
					
					System.out.println(entry.getKey() + "는 " + entry.getValue() + "점 입니다! " + (i+1) + "등이네요");
				
//					nameorder[i]= entry.getKey();					
					
				}
			}
			
			
		}
		
//		
//			
//		for(int i = 0; i < score1.size(); i++) {
//			
//			System.out.println(nameorder[i] + "는" + score1.get(i) + "입니다! " + (i+1) + "등이네요");
//		}
//		
		
	}

}
