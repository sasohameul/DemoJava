package No3_ZZANGGU;

import java.util.*;
import java.util.regex.*;

public class quiz_3_MG {
    public static void main(String[] args) {
        String quiz = "단비 학생은 60점입니다 짱구 학생은 55점입니다 짱아 학생은 70점입니다 맹구 학생은 80점입니다 훈이 학생은 시험을 치루지 않아 0점입니다 유리 학생은 86점입니다 김철수 학생은 저번 시험에서 우수한 성적을 거둬 100점입니다!";

        // 1. 정규 표현식을 이용해서 문자열을 나누고 출력
        String pattern = "(\\p{IsHangul}+ 학생은 \\d+점입니다)";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(quiz);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println("---------------------------");
        }

        // 2. 이름과 점수를 Map에 담기
        Map<String, Integer> studentScores = new HashMap<>();
        pattern = "(\\p{IsHangul}+) 학생은 (\\d+)점입니다";
        regex = Pattern.compile(pattern);
        matcher = regex.matcher(quiz);

        while (matcher.find()) {
            String name = matcher.group(1);
            int score = Integer.parseInt(matcher.group(2));
            studentScores.put(name, score);
        }

        // 3. 점수가 높은 순서대로 등수 출력
        List<Map.Entry<String, Integer>> sortedScores = new ArrayList<>(studentScores.entrySet());
        Collections.sort(sortedScores, Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("점수가 높은 순서대로 등수 출력:");
        int rank = 1;
        for (Map.Entry<String, Integer> entry : sortedScores) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println("---------------------------");
            System.out.println(name + "는 " + score + "점입니다! " + rank + "등이네요");
            rank++;
        }
        System.out.println("---------------------------");
    }
}
