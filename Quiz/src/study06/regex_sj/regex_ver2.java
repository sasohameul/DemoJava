package study06.regex_sj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_ver2 {

	public static void main(String[] args) {

		String quiz = "단비 학생은 60점입니다 "
				+ "짱구 학생은 55점입니다 "
				+ "짱아 학생은 70점입니다 "
				+ "맹구 학생은 80점 입니다 "
				+ "훈이 학생은 시험을 치루지 않아 0점입니다 "
				+ "유리 학생은 86점입니다 "
				+ "김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";

		String pattern = "\\D+ \\d+\\D+다\\s*!*";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(quiz);
		String score = "\\d{1,3}";
		Matcher m1 = Pattern.compile(score).matcher(quiz);

		int scoreResult;
		String str;
		String [] name;

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		ArrayList<Integer> list = new ArrayList();

		//출력 및 저장 
		while(m.find() && m1.find()) {

			System.out.println(m.group());
			str = m.group();
			name = str.split(" ");
			scoreResult = Integer.parseInt(m1.group());

			hm.put(name[0], scoreResult);
			list.add(scoreResult);

		}

		System.out.println(hm);
		Collections.sort(list,Collections.reverseOrder());

		for(int i = 0; i < hm.size() ; i++) {

			for(Entry<String,Integer> entry : hm.entrySet()) {

				if(list.get(i).equals(entry.getValue())) {

					System.out.println(entry.getKey() + "는 " +entry.getValue() + "점 입니다." + (i+1) + "등이네요!");
				}
			}

		}

	}

} 
