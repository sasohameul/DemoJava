package No3_ZZANGGU;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Study06_3_2_HJ {
	public static void main(String[] args) {
		
		String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 맹구 학생은 80점 입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";
		
		TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
		
		Pattern p1 = Pattern.compile("[\\D]+ [0-9]+점 ?입니다[\\s|!]");
		Pattern p2 = Pattern.compile("[0-9]+");
		
		Matcher m1 = p1.matcher(quiz);
		Matcher m2 = p2.matcher(quiz);
		int i = 1;
		
		while(m1.find()&&m2.find()) {
			System.out.println("------------------");

			String str = m1.group();
			
			System.out.println(str);
			
			String name = str.charAt(2)==' '?str.substring(0, 2):str.substring(0, 3);
			int score = Integer.parseInt(m2.group());
			map.put(score, name);
		}
		
		System.out.println("============================================");
		
		for(Map.Entry<Integer, String> ent : map.entrySet()) {
			
			System.out.println(ent.getValue() + "는 " + ent.getKey() + "점 입니다! " + i + "등이네요");
			i++;
			System.out.println("------------------");
		}
		
		
	}
}
