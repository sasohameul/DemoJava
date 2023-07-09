package No3_ZZANGGU;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Study06_3_HJ {
	public static void main(String[] args) {
		
		String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 맹구 학생은 80점 입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";
		HashMap<String, Integer> map = new HashMap<>();
		TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
		
		Pattern p1 = Pattern.compile("[\\D]+ [0-9]+점 ?입니다[\\s|!]");
		Pattern p2 = Pattern.compile("[0-9]+");
		
		Matcher m1 = p1.matcher(quiz);
		Matcher m2 = p2.matcher(quiz);
		int i = 1;
		
		while(m1.find()&&m2.find()) {
			String str = m1.group();
			
			System.out.println("------------------");
			System.out.println(str);
			
			String name = str.charAt(2)==' '?str.substring(0, 2):str.substring(0, 3);
			int score = Integer.parseInt(m2.group());
			map.put(name, score);
			set.add(score);
		}
		
		System.out.println("============================================");
		
		for(int n : set) {
			for(Map.Entry<String, Integer> ent : map.entrySet()) {
				if(ent.getValue() == n) {
					System.out.println(ent.getKey() + "는 " + n + "점 입니다! " + i + "등 입니다.");
					i++;
					System.out.println("------------------");
				}
			}
		}
	}
}
