package No6_EnglishWords;

import java.util.HashMap;
import java.util.Scanner;

public class Studylj06_JS {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열의 길이를 입력하세요 > ");
		int chSize = scan.nextInt();
		
		String[] words = { "better", "vest", "raspy", "tearful", "dream", "accept", "ignore", "elfin", "pat", "wail",
				"itchy", "attract", "unpack", "assorted", "month", "cast", "beef", "arithmetic", "petite", "umbrella",
				"kaput", "frightened", "frame", "abounding", "yak", "resonant", "trace", "simplistic", "three", "slip",
				"train", "name", "lock", "windy", "guide", "calm", "tedious", "decisive", "illustrious", "exciting",
				"lamp", "adamant", "average", "finger", "sack", "vanish", "damaged", "bed", "compare", "notebook",
				"beds", "delight", "cowardly", "unknown", "shiver", "kill", "bright", "greedy", "makeshift", "cellar",
				"owe", "pack", "water", "paper", "rub", "incompetent", "neck", "tense", "airport", "cheap", "structure",
				"gaudy", "wound", "knot", "park", "simple", "brush", "fail", "volatile", "jam", "chubby", "pour",
				"load", "abortive", "increase", "knowledge", "meal", "cream", "stitch", "laugh", "treatment", "reach",
				"approval", "war", "kindhearted", "comparison", "past", "standing", "crown", "society" };

		HashMap<Character, Integer> wordsMap = new HashMap<>();
		
		for(int i = 0; i < words.length; i++) {
			if ( words[i].length() == chSize) {
				System.out.println(words[i]);
				for(int j = 0; j < chSize; j++) {
					char ch = words[i].charAt(j);
					if(wordsMap.containsKey(ch)) {
						wordsMap.put(ch, wordsMap.get(ch)+1);
					} else {
						wordsMap.put(ch, 1);
					}
				}
			}
		}
		System.out.println();
		System.out.print(wordsMap);
	}
}
