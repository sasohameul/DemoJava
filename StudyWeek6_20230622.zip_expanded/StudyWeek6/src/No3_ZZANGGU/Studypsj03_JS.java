package No3_ZZANGGU;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Studypsj03_JS {
   public static void main(String[] args) {
      
      Map<String, Integer> zzangMap = new HashMap<>();
      ArrayList<String> keylist = new ArrayList<>();
      ArrayList<Integer> vallist = new ArrayList<>();
      
      String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 맹구 학생은 80점 입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";
      
      //String pattern1 = "([가-힣]{2,3}\\s학생은)\\s[0-9]{1,3}[가-힣]*\\s?입니다|훈이 학생은|0점입니다|김철수 학생은|100점입니다!|";
      String pattern1 = "[가-힣]*\s학생은\s[0-9]{1,3}[가-힣]*\s?입니다";
      
      
      Pattern p1 = Pattern.compile(pattern1);
      
      //찾는 직업
      Matcher m1 = p1.matcher(quiz);
      
      while(m1.find()) {
         
//         System.out.println("첫번째인덱스 : " + m1.start());
//         System.out.println("마지막인덱스 : " + m1.end());
         String str = m1.group();
         
         zzangMap.put(str.substring(0, 2),Integer.parseInt(str.substring(7, 9)));
         
         keylist = new ArrayList<>(zzangMap.keySet());
         vallist = new ArrayList<>(zzangMap.values());   
         
         
         
      }
      Collections.sort(vallist);
      System.out.println(vallist);
      for(int i = 4; i >= 0; i--) {
         
      }

      System.out.println(zzangMap);
   }

}
